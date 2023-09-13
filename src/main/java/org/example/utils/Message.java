package org.example.utils;

public enum Message {

    NAME_FORMAT("Invalid name format."),
    NAME_LENGTH("Invalid name length."),
    NUMBER_VALUE("Location must be a number between 1 and 4."),
    EMAIL_VALUE("Invalid email provided."),
    NIT_LENGTH("Invalid NIT length."),
    NIT_VALUE("Invalid NIT value."),
    DATE_INVALID_FORMAT("Invalid date format. Try dd/mm/yy"),
    DATE_START_DATE("Start date cannot be higher than end date."),
    NEGATIVE_COST("Cost is negative. Only positives."),
    RESERVATIONS("Cannot have more than 4 people."),
    MAXMEMBERSHIP("Max amount is 100.000"),
    MAXEVENT("Max amount is 200.000");
    private String message;

    Message(String msg) {
        this.message = msg;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
