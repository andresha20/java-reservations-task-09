package org.example.models;

import java.text.DateFormat;

public class Reservation {

    private Integer id;
    private Integer idUser;
    private Double totalCost;
    private Integer totalUsers;
    private DateFormat reservationDate;

    @Override
    public String toString() {
        return "Reservation: {" +
                "User ID: " + idUser +
                "Total cost: " + totalCost +
                "Reservation date: " + reservationDate +
                "ID: " + id +
                "}";
    }

    public Reservation() {
    }

    public Reservation(Integer id, Integer idUser, Double totalCost, DateFormat reservationDate, Integer totalUsers) {
        this.id = id;
        this.idUser = idUser;
        this.totalCost = totalCost;
        this.reservationDate = reservationDate;
        this.totalUsers = totalUsers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public DateFormat getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(DateFormat reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Integer getTotalUsers() {
        return totalUsers;
    }

    public void setTotalUsers(Integer totalUsers) {
        this.totalUsers = totalUsers;
    }
}
