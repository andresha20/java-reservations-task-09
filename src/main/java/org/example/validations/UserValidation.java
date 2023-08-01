package org.example.validations;

import org.example.utils.Util;

public class UserValidation {
    // Ordinary methods


    public boolean validateName(String name) throws Exception {
        Boolean matches = Util.searchRegexCoincidence(name, "^[a-zA-Z]+$");
        if (!matches) {
            throw new Exception("Wrong format");
        }
        if (name.length() < 10) {
            throw new Exception("Invalid character length");
        }
        return true;
    }

    public boolean validateLocation(Integer locationId) {
        return true;
    }

    public boolean validateEmail(String email) throws Exception {
        Boolean matches = Util.searchRegexCoincidence(email, "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        if (!matches) {
            throw new Exception("");
        }
        return true;
    }
}
