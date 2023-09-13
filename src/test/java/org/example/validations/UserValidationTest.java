package org.example.validations;

import org.example.utils.Message;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserValidationTest {
    UserValidation userValidation;

    @BeforeEach
    public void setup() {
        this.userValidation = new UserValidation();

    }

    @Test
    public void testNameValidation() {
        String name = "And";
        Exception response = Assertions.assertThrows(Exception.class, () -> this.userValidation.validateName(name));
        Assertions.assertEquals(Message.NAME_LENGTH.getMessage(), response.getMessage());
    }

    @Test
    public void testNameLength() {
        String name = "A3 d@2";
        Exception response = Assertions.assertThrows(Exception.class, () -> this.userValidation.validateName(name));
        Assertions.assertEquals("Invalid name length.", response.getMessage());
    }

    @Test
    public void testValidName() {
        String name = "AndrésAlzate";
        Boolean response = Assertions.assertDoesNotThrow(() -> this.userValidation.validateName(name));
        Assertions.assertTrue(response);
    }

    @Test
    public void testValidEmail() {
        String email = "juantest@gmail.com";
        Boolean response = Assertions.assertDoesNotThrow(() -> this.userValidation.validateEmail(email));
        Assertions.assertTrue(response);
    }

    @Test
    public void testInvalidEmail() {
        String email = "juantestmail.com";
        Exception response = Assertions.assertThrows(Exception.class, () -> this.userValidation.validateEmail(email));
        Assertions.assertEquals(Message.EMAIL_VALUE.getMessage(), response.getMessage());
    }

    @Test
    public void testValidLocation() {
        Integer number = 2;
        Boolean response = Assertions.assertDoesNotThrow(() -> this.userValidation.validateLocation(number));
        Assertions.assertTrue(response);
    }

    @Test
    public void testInvalidLocation() {
        Integer number = 0;
        Exception response = Assertions.assertThrows(Exception.class, () -> this.userValidation.validateLocation(number));
        Assertions.assertEquals(Message.NUMBER_VALUE.getMessage(), response.getMessage());
    }
}