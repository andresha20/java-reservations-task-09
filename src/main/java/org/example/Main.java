package org.example;

import org.example.models.Business;
import org.example.models.Offer;
import org.example.models.Reservation;
import org.example.models.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User userModel = new User();
        Offer offerModel = new Offer();
        // Business businessModel = new Business();
        Reservation reservationModel = new Reservation();
        Boolean isInvalid = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select output type: 1 = Invalid inputs | 2 = Valid inputs");
        if (scanner.nextInt() == 1) {
            isInvalid = true;
        }
        if (!isInvalid) {
            System.out.println("User validations");
            System.out.println("================");
            userModel.setNames("VALID NAME: Andrés Henao Alzate");
            userModel.setLocation(4);
            userModel.setLocation(2);
            userModel.setEmail("andreshenao.2021@gmail.com");
            System.out.println("Offer validations");
            System.out.println("================");
            offerModel.setTitle("Título menor a 20");
            offerModel.setEndDate("06-09-2000");
            offerModel.setStartDate("03-09-2000", "06-09-2000");
            offerModel.setPersonCost(10.5);
            System.out.println("Local validations");
            System.out.println("================");
            // businessModel.setNit("1001237619");
            // businessModel.setName("This is my business name");
            System.out.println("Reservation validations");
            System.out.println("================");
            reservationModel.setReservationDate("03-09-2000");
            reservationModel.setTotalUsers(4);
            System.out.println("All user validations succeeded.");
        } else {
            System.out.println("User invalid validations");
            System.out.println("================");
            userModel.setNames("INVALID NAME: Andrés");
            userModel.setLocation(5);
            userModel.setEmail("andreshenao@lopeaz");
            System.out.println("All user validations succeeded.");
            System.out.println("================");
            System.out.println("Offer invalid validations");
            System.out.println("================");
            offerModel.setTitle("Título mayor a 20 caracteres");
            offerModel.setEndDate("06/09-2000");
            offerModel.setStartDate("03-09-2000", "01-09-2000");
            offerModel.setPersonCost(-5.2);
            System.out.println("================");
            System.out.println("Local validations");
            System.out.println("================");
            // businessModel.setNit("10012gcs619");
            // businessModel.setName("This is my business name that is longer than 30 characters and it doesn't fit my required validation");
            System.out.println("================");
            System.out.println("Reservation validations");
            System.out.println("================");
            reservationModel.setReservationDate("03/09-2000");
            reservationModel.setTotalUsers(5);
        }
    }
}