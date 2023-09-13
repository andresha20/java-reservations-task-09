package org.example.validations;

import org.example.utils.Message;
import org.example.utils.Util;

public class UserValidation {
    // Ordinary methods

    public boolean validateName(String name) throws Exception {
        Boolean matches = Util.searchRegexCoincidence(name, "^(?![\\d ]{10,})[^\\d]{10,}$");
        if (!matches) {
            if (name.length() < 10) {
                throw new Exception(Message.NAME_LENGTH.getMessage());
            }
            throw new Exception(Message.NAME_FORMAT.getMessage());
        }
        return true;
    }

    public boolean validateLocation(Integer locationId) throws Exception {
        if (locationId == 0 || locationId > 4) {
            throw new Exception(Message.NUMBER_VALUE.getMessage());
        }
        return true;
    }

    public boolean validateEmail(String email) throws Exception {
        Boolean matches = Util.searchRegexCoincidence(email, "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        if (!matches) {
            throw new Exception(Message.EMAIL_VALUE.getMessage());
        }
        return true;
    }
}
