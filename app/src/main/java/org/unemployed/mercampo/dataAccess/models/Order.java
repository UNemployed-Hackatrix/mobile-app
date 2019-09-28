package org.unemployed.mercampo.dataAccess.models;

import java.util.ArrayList;
import java.util.Date;

import com.google.firebase.firestore.GeoPoint;

public class Order {

    public Order(GeoPoint origin, GeoPoint destination, ArrayList<Product> products, Date outs, double totalPrice, String status) {
        this.origin = origin;
        this.destination = destination;
        this.products = products;
        this.outs = outs;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public Order(GeoPoint origin, GeoPoint destination, ArrayList<Product> products, double totalPrice, String status) {
        this.origin = origin;
        this.destination = destination;
        this.products = products;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public GeoPoint getOrigin() {
        return origin;
    }

    public void setOrigin(GeoPoint origin) {
        this.origin = origin;
    }

    public GeoPoint getDestination() {
        return destination;
    }

    public void setDestination(GeoPoint destination) {
        this.destination = destination;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public Date getOuts() {
        return outs;
    }

    public void setOuts(Date outs) {
        this.outs = outs;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private GeoPoint  origin, destination;
    private ArrayList<Product> products;
    private Date outs, arrival;
    private double totalPrice;
    private String status;
}
