package org.example.validations;

import org.example.utils.Message;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusinessValidationTest {
    BusinessValidation businessValidation;

    @BeforeEach
    public void setup() {
        this.businessValidation = new BusinessValidation();

    }
    

    @Test
    public void testValidNIT() {
        String name = "1001237619";
        Boolean response = Assertions.assertDoesNotThrow(() -> this.businessValidation.validateNIT(name));
        Assertions.assertTrue(response);
    }


    @Test
    public void testValidLocalName() {
        String name = "Andres' business";
        Boolean response = Assertions.assertDoesNotThrow(() -> this.businessValidation.validateLocalName(name));
        Assertions.assertTrue(response);
    }
}