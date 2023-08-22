package org.example.models;

import org.example.validations.OfferValidation;
import org.example.validations.ReservationValidation;

public class Reservation {

    private Integer id;
    private Integer idUser;
    private Double totalCost;
    private Integer totalUsers;
    private String reservationDate;
    private OfferValidation offerValidation = new OfferValidation();
    private ReservationValidation reservationValidation = new ReservationValidation();

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

    public Reservation(Integer id, Integer idUser, Double totalCost, String reservationDate, Integer totalUsers) {
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

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        try {
            offerValidation.validateDateFormat(reservationDate);
            this.reservationDate = reservationDate;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Integer getTotalUsers() {
        return totalUsers;
    }

    public void setTotalUsers(Integer totalUsers) {
        try {
            reservationValidation.validateReservationUsers(totalUsers);
            this.totalUsers = totalUsers;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }    }
}
