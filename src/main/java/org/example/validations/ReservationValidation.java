package org.example.validations;

import org.example.utils.Message;
import org.example.utils.Util;

import java.text.DateFormat;

public class ReservationValidation {

    public boolean validateFormat(String date) throws Exception {
        String dateRegex = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-\\d{4}$";
        Boolean dateMatches = Util.searchRegexCoincidence(date, dateRegex);
        if (!dateMatches) {
            throw new Exception(Message.DATE_INVALID_FORMAT.getMessage());
        }
        return true;
    }

    public boolean validateReservationUsers(Integer users) throws Exception {
        if (users > 4) {
            throw new Exception(Message.RESERVATIONS.getMessage());
        }
        return true;
    }


}
