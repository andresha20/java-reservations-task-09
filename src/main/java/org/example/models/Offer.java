package org.example.models;

import org.example.validations.OfferValidation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Offer {

    private Integer id;
    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double personCost;
    private Integer idLocal;

    private OfferValidation offerValidation = new OfferValidation();
    public Offer() {
    }
    public Offer(Integer id, String title, String description, LocalDate startDate, LocalDate endDate, Double personCost, Integer idLocal) {
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
        try {
            offerValidation.validateTitle(title);
            this.title = title;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate, String endDate) {
        try {
            offerValidation.validateDateFormat(startDate);
            offerValidation.validateStartDate(startDate, endDate);
            this.startDate = LocalDate.parse(startDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        try {
            offerValidation.validateDateFormat(endDate);
            this.endDate = LocalDate.parse(endDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Double getPersonCost() {
        return personCost;
    }

    public void setPersonCost(Double personCost) {
        try {
            offerValidation.validateCost(personCost);
            this.personCost = personCost;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }
}
