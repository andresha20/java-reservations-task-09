package org.example.validations;

import org.example.utils.Message;

public class UserEventValidation {
    public Boolean validateMembershipMaxValue(Double cost) throws Exception {
        if (cost <= 0) {
            throw new Exception(Message.NEGATIVE_COST.getMessage());
        }
        if (cost > 200000) {
            throw new Exception(Message.MAXEVENT.getMessage());
        }
        return true;
    }
}
