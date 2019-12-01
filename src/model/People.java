package model;

import java.security.acl.Group;
import java.util.ArrayList;
import java.util.List;

public class People {

    private String name;
    private List<Order> orderItems;
    private GroupAdmin groupAdmin;


    public People(String name, GroupAdmin groupAdmin) {
        this.name = name;
        orderItems = new ArrayList<>();
        this.groupAdmin = groupAdmin;

    }


    public void addOrderItems(Order order) {
        orderItems.add(order);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<Order> orderItems) {
        this.orderItems = orderItems;
    }

    public GroupAdmin getGroupAdmin() {
        return groupAdmin;
    }

    public void setGroupAdmin(GroupAdmin groupAdmin) {
        this.groupAdmin = groupAdmin;
    }



}
