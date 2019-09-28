package org.unemployed.mercampo.dataAccess.models;

public class Product {

    private String name, description;
    private int amount, classification;
    private boolean units;
    private double pricePerUnit;

    public Product(String name, String description, int amount, boolean units, double pricePerUnit, int classification) {
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.units = units;
        this.pricePerUnit = pricePerUnit;
        this.classification = classification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassification() {
        return classification;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isUnits() {
        return units;
    }

    public void setUnits(boolean units) {
        this.units = units;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
}
