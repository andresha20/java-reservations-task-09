package org.example.models;

import org.example.validations.LocalValidation;

public class Local {

    private Integer id;
    private String name;
    private String nit;
    private Integer location;
    private String description;

    private LocalValidation localValidation = new LocalValidation();
    public Local() {
    }
    public Local(Integer id, String name, String nit, Integer location, String description) {
        this.id = id;
        this.name = name;
        this.nit = nit;
        this.location = location;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Offer: {" +
                "Name: " + name +
                "Nit: " + nit +
                "Location: " + location +
                "Description: " + description +
                "ID: " + id +
                "}";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            localValidation.validateLocalName(name);
            this.name = name;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        try {
            localValidation.validateNIT(nit);
            this.nit = nit;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
