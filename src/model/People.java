package model;

import java.util.ArrayList;
import java.util.List;

public class People {

    private String name;
    private List<String> orderItems;
    private GroupAdmin groupAdmin;


    public People(String name, boolean groupAdminStatus) {

        this.name = name;
        orderItems = new ArrayList<>();
        if (groupAdminStatus) {
            groupAdmin = new GroupAdmin();
        }

    }


    public void addOrderItems() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<String> orderItems) {
        this.orderItems = orderItems;
    }

    public GroupAdmin getGroupAdmin() {
        return groupAdmin;
    }

    public void setGroupAdmin(GroupAdmin groupAdmin) {
        this.groupAdmin = groupAdmin;
    }



}
