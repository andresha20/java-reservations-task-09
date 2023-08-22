package org.example.validations;

import org.example.utils.Message;
import org.example.utils.Util;

public class LocalValidation {
    public boolean validateNIT(String NIT) throws Exception {
        Boolean matches = Util.searchRegexCoincidence(NIT, "^\\d{10}$");
        if (!matches) {
            throw new Exception(Message.NIT_VALUE.getMessage());
        }
        return true;
    }

    public boolean validateLocalName(String localName) throws Exception {
        Boolean matches = Util.searchRegexCoincidence(localName, "^.{5,30}$");
        if (!matches) {
            throw new Exception(Message.NAME_FORMAT.getMessage());
        }
        return true;
    }
}
