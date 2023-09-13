package org.example.validations;

import org.example.utils.Message;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationValidationTest {

    ReservationValidation reservationValidation;

    @BeforeEach
    public void setup() {
        this.reservationValidation = new ReservationValidation();

    }
    
    @Test
    public void testValidateFormat_ValidDate() throws Exception {
        Boolean result = this.reservationValidation.validateFormat("10-09-2023"); // Valid date format
        assertTrue(result);
    }

    @Test
    public void testValidateFormat_InvalidDate() {
        Exception exception = assertThrows(Exception.class, () -> this.reservationValidation.validateFormat("2023-09-10"));
        assertEquals("Invalid date format. Try dd/mm/yy", exception.getMessage());
    }

    @Test
    public void testValidateFormat_InvalidDateValues() {
        Exception exception = assertThrows(Exception.class, () -> this.reservationValidation.validateFormat("32-13-2023"));
        assertEquals("Invalid date format. Try dd/mm/yy", exception.getMessage());
    }

    @Test
    public void testValidateInvalidReservationUsers() {
        Integer number = 5;
        Exception response = Assertions.assertThrows(Exception.class, () -> this.reservationValidation.validateReservationUsers(number));
        Assertions.assertEquals(Message.RESERVATIONS.getMessage(), response.getMessage());
    }

    @Test
    public void testValidateValidReservationUsers() {
        Integer number = 2;
        Boolean response = Assertions.assertDoesNotThrow(() -> this.reservationValidation.validateReservationUsers(number));
        Assertions.assertTrue(response);
    }
}