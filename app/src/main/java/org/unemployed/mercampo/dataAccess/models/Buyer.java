package org.unemployed.mercampo.dataAccess.models;

import java.util.ArrayList;

public class Buyer extends User {
    ArrayList<Order> currentOrders, completedOrders;
    String payment;

    public Buyer(String name, float score, ArrayList<Order> currentOrders, ArrayList<Order> completedOrders, String payment) {
        super(name, score);
        this.currentOrders = currentOrders;
        this.completedOrders = completedOrders;
        this.payment = payment;
    }

    public ArrayList<Order> getCurrentOrders() {
        return currentOrders;
    }

    public void setCurrentOrders(ArrayList<Order> currentOrders) {
        this.currentOrders = currentOrders;
    }

    public ArrayList<Order> getCompletedOrders() {
        return completedOrders;
    }

    public void setCompletedOrders(ArrayList<Order> completedOrders) {
        this.completedOrders = completedOrders;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
}
