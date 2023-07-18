package org.example;

import org.example.models.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        User user = new User();
        System.out.println("Write names");
        String names = keyboard.nextLine();
        user.setNames(names);


    }
}