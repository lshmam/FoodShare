package model;

import java.util.ArrayList;

public class GroupAdmin {

    String adminName;
    ArrayList<People> peopleList;

    public GroupAdmin(String name){
        adminName = name;
        peopleList = new ArrayList<>();
    }

    public void addPeople(People p){
        peopleList.add(p);
    }


}
