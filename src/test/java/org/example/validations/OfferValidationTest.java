package org.example.validations;

import org.example.models.Offer;
import org.example.utils.Message;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfferValidationTest {
    OfferValidation offerValidation;

    @BeforeEach
    public void setup() {
        this.offerValidation = new OfferValidation();
    }

    @Test
    public void testTitleValidationLengthLessThan5() {
        String name = "And";
        Exception response = Assertions.assertThrows(Exception.class, () -> this.offerValidation.validateTitle(name));
        Assertions.assertEquals(Message.NAME_FORMAT.getMessage(), response.getMessage());
    }
    @Test
    public void testTitleValidationLengthMoreThan20() {
        String name = "Andres Henao Alzate Rodriguez Lopera";
        Exception response = Assertions.assertThrows(Exception.class, () -> this.offerValidation.validateTitle(name));
        Assertions.assertEquals(Message.NAME_FORMAT.getMessage(), response.getMessage());
    }

    @Test
    public void testValidateDateFormat_ValidDate() throws Exception {
        String date = "10-09-2023";
        Boolean result = offerValidation.validateDateFormat(date);
        assertTrue(result);
    }

    @Test
    public void testValidateStartDateFormat_ValidDate() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> offerValidation.validateStartDate("03-01-2023", "02-01-2023"));
        assertEquals(Message.DATE_START_DATE.getMessage(), exception.getMessage());
    }

    @Test
    public void testValidateDateFormat_InvalidDateFormat() {
        String date = "2023-09-10";
        Exception exception = assertThrows(Exception.class, () -> offerValidation.validateDateFormat(date));
        assertEquals("Invalid date format. Try dd/mm/yy", exception.getMessage());
    }

    @Test
    public void testValidateDateFormat_InvalidDateValues() {
        String date = "32-13-2023";
        Exception exception = assertThrows(Exception.class, () -> offerValidation.validateDateFormat(date));
        assertEquals("Invalid date format. Try dd/mm/yy", exception.getMessage());
    }

    @Test
    public void testValidateCost_ValidCost() throws Exception {
        Boolean result = offerValidation.validateCost(100.0);
        assertTrue(result);
    }

    @Test
    public void testValidateCost_NegativeCost() {
        Exception exception = assertThrows(Exception.class, () -> offerValidation.validateCost(-50.0));
        assertEquals("Cost is negative. Only positives.", exception.getMessage());
    }

    @Test
    public void testValidateCost_ZeroCost() throws Exception {
        Boolean result =  offerValidation.validateCost(0.0);
        assertTrue(result);
    }

}