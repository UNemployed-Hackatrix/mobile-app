package org.unemployed.mercampo.dataAccess.models;

import java.util.ArrayList;

public class Seller extends User{
    private ArrayList<Product> offer;

    public ArrayList<Product> getOffer() {
        return offer;
    }

    public void setOffer(ArrayList<Product> offer) {
        this.offer = offer;
    }

    public Seller(String name, float score, ArrayList<Product> offer) {
        super(name, score);
        this.offer = offer;
    }
}
