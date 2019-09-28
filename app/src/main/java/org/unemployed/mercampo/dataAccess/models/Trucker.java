package org.unemployed.mercampo.dataAccess.models;

import com.google.firebase.firestore.GeoPoint;

import java.util.Date;

public class Trucker extends User{

    private GeoPoint currentLocation;
    private int id;
    private String  truckId, truckType, soat;
    private int licenseId;
    private Date licenseValidity;

    public Trucker(int id, String name, String truckId, String truckType, String soat, Date licenseValidity, int licenseId) {
        super(name, 5.0f);
        this.id = id;
        this.truckId = truckId;
        this.truckType = truckType;
        this.soat = soat;
        this.licenseId = licenseId;
        this.licenseValidity = licenseValidity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTruckId() {
        return truckId;
    }

    public void setTruckId(String truckId) {
        this.truckId = truckId;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public String getSoat() {
        return soat;
    }

    public void setSoat(String soat) {
        this.soat = soat;
    }

    public GeoPoint getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(GeoPoint currentLocation) {
        this.currentLocation = currentLocation;
    }





}
