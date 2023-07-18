package org.example.models;

import java.text.DateFormat;

public class Offer {

    private Integer id;
    private String title;
    private String description;
    private DateFormat startDate;
    private DateFormat endDate;
    private Double personCost;
    private Integer idLocal;

    public Offer() {
    }
    public Offer(Integer id, String title, String description, DateFormat startDate, DateFormat endDate, Double personCost, Integer idLocal) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.personCost = personCost;
        this.idLocal = idLocal;
    }

    @Override
    public String toString() {
        return "Offer: {" +
                "Local ID: " + idLocal +
                "Title: " + title +
                "Description: " + description +
                "Start date: " + startDate +
                "End date: " + endDate +
                "Person cost: " + personCost +
                "ID: " + id +
                "}";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DateFormat getStartDate() {
        return startDate;
    }

    public void setStartDate(DateFormat startDate) {
        this.startDate = startDate;
    }

    public DateFormat getEndDate() {
        return endDate;
    }

    public void setEndDate(DateFormat endDate) {
        this.endDate = endDate;
    }

    public Double getPersonCost() {
        return personCost;
    }

    public void setPersonCost(Double personCost) {
        this.personCost = personCost;
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }
}
