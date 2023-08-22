package org.example.models;

import org.example.validations.UserValidation;

public class User {
    private Integer id;
    private String document;
    private String names;
    private String email;
    private Integer location;

    private final UserValidation userValidation = new UserValidation();

    public User() {
    }

    public User(Integer id, String document, String names, String email, Integer location) {
        this.id = id;
        this.document = document;
        this.names = names;
        this.email = email;
        this.location = location;
    }

    @Override
    public String toString() {
        return "User: {" +
                "Name: " + names +
                "Document: " + document +
                "Email: " + email +
                "Location: " + location +
                "ID: " + id +
                "}";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        try {
            this.userValidation.validateName(names);
            this.names = names;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        try {
            userValidation.validateEmail(email);
            this.email = email;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        try {
            userValidation.validateLocation(location);
            this.location = location;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
