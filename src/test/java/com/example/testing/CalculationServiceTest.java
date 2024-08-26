package com.example.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculationServiceTest {
    @Test
    void shouldAdd() {
        CalculationService calculationService = new CalculationService();
        int actualResult = calculationService.add(1, 1);
        int expectedResult = 3;
        assertEquals(expectedResult, actualResult);
    }
}
