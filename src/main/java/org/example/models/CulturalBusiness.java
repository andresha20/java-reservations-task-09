package org.example.models;

public class CulturalBusiness extends Business {
    private String entity;
    private String mission;

    public CulturalBusiness() {
    }

    public CulturalBusiness(Integer id, String name, String nit, Integer location, String description, String entity, String mission) {
        super(id, name, nit, location, description);
        this.entity = entity;
        this.mission = mission;
    }

    @Override
    public Double charge() {

        return null;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }
}
