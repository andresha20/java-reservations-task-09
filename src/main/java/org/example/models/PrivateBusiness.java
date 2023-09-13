package org.example.models;

public class PrivateBusiness extends Business {
    String document;
    String name;

    public PrivateBusiness() { }

    public PrivateBusiness(String document) {
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Double charge() {
        return null;
    }
}
