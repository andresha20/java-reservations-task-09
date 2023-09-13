package org.example.validations;

import org.example.utils.Message;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserEventValidationTest {
    UserEventValidation userEventValidation;

    @BeforeEach
    public void setup() {
        this.userEventValidation = new UserEventValidation();
    }
    @Test
    public void validateTestOversize() {
        Double test = 300.000;
        Exception response = Assertions.assertThrows(Exception.class, () -> this.userEventValidation.validateMembershipMaxValue(test));
        Assertions.assertEquals(Message.MAXEVENT.getMessage(), response.getMessage());
    }
    @Test
    public void validateTestIsZero() {
        Double test = 0.0;
        Exception response = Assertions.assertThrows(Exception.class, () -> this.userEventValidation.validateMembershipMaxValue(test));
        Assertions.assertEquals(Message.NEGATIVE_COST.getMessage(), response.getMessage());
    }
    @Test
    public void validateTestHasNoErrors() {
        Double test = 75.000;
        Boolean response = Assertions.assertDoesNotThrow(() -> this.userEventValidation.validateMembershipMaxValue(test));
        Assertions.assertTrue(response);
    }
}

