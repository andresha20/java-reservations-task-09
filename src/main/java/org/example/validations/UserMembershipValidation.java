package org.example.validations;

import org.example.utils.Message;

public class UserMembershipValidation {
    public Boolean validateMembershipMaxValue(Double cost) throws Exception {
        if (cost <= 0) {
            throw new Exception(Message.NEGATIVE_COST.getMessage());
        }
        if (cost > 100000) {
            throw new Exception(Message.MAXMEMBERSHIP.getMessage());
        }
        return true;
    }
}
