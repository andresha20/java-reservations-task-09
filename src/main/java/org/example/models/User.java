package org.example.models;

public class User {
    private Integer id;
    private String document;
    private String names;
    private String email;
    private Integer location;

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
        this.names = names;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }
}
