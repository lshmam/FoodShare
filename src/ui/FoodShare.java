package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Restaurant;

public class FoodShare extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Restaurant sampleRestaurant = new Restaurant("Coochie store");


        Parent root = FXMLLoader.load(getClass().getResource("initialMenu.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
