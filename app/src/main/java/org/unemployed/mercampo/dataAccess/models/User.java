package org.unemployed.mercampo.dataAccess.models;

public class User {
    private String name;
    private float score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public User(String name, float score) {
        this.name = name;
        this.score = score;
    }
}
