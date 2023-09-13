package org.example.models;

public class UserMembership extends User {

    private Double monthlyCost;

    public UserMembership() {
    }

    public UserMembership(Integer id, String document, String names, String email, Integer location, Double monthlyCost) {
        super(id, document, names, email, location);
        this.monthlyCost = monthlyCost;
    }

    public Double getMonthlyCost() {
        return monthlyCost;
    }

    public void setMonthlyCost(Double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public void addInvites() {

    }
}
