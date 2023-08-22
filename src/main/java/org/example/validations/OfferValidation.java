package org.example.validations;

import org.example.utils.Message;
import org.example.utils.Util;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class OfferValidation {

    public boolean validateTitle(String title) throws Exception {
        Boolean matches = Util.searchRegexCoincidence(title, "^.{5,20}$");
        if (!matches) {
            throw new Exception(Message.NAME_FORMAT.getMessage());
        }
        return true;
    }

    public boolean validateDateFormat(String givenDate) throws Exception {
        String dateRegex = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-\\d{4}$";
        Boolean isValidDate = Util.searchRegexCoincidence(givenDate, dateRegex);
        if (!isValidDate) {
            throw new Exception(Message.DATE_INVALID_FORMAT.getMessage());
        }
        return true;
    }


    public boolean validateStartDate(String startDate, String endDate) throws Exception {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate validStartDate = LocalDate.parse(startDate, formatter);
            LocalDate validEndDate = LocalDate.parse(endDate, formatter);
            if (validStartDate.isAfter(validEndDate)) {
                throw new Exception(Message.DATE_START_DATE.getMessage());
            }
        } catch (DateTimeParseException e) {
            throw new Exception(Message.DATE_INVALID_FORMAT.getMessage());
        }
        return true;
    }

    public boolean validateCost(Double cost) throws Exception{
        if (cost < 0) {
            throw new Exception(Message.NEGATIVE_COST.getMessage());
        }
        return true;
    }
}
