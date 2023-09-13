package org.example.models;

public class UserEvent extends User {
    public double costPerEvent;

    public UserEvent() {
    }

    public UserEvent(Integer id, String document, String names, String email, Integer location, double costPerEvent) {
        super(id, document, names, email, location);
        this.costPerEvent = costPerEvent;
    }

    public double getCostPerEvent() {
        return costPerEvent;
    }

    public void setCostPerEvent(double costPerEvent) {
        this.costPerEvent = costPerEvent;
    }

    public void calculateDiscount() {

    }
}
