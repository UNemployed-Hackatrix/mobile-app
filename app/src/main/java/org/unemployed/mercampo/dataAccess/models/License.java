package org.unemployed.mercampo.dataAccess.models;

import java.util.Date;

public class License {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getValidity() {
        return validity;
    }

    public void setValidity(Date validity) {
        this.validity = validity;
    }

    private int id;
    private Date validity;

    public License(int id, Date validity) {
        this.id = id;
        this.validity = validity;
    }
}
