package com.richard.danis.www.java.twelve;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Java12Test {

    private Java12 java12;

    @BeforeEach
    public void init() {
        java12 = new Java12();
    }

    @Test
    public void testNewSwitchExpression() {
        String actual = java12.newSwitchExpression("M");

        assertEquals("MWF", actual);
    }

    @Test
    public void testBetterNumberFormatShouldReturnOneDecimalPlacesNumber() {
        String actual = java12.betterNumberFormat(1234L, 1);

        assertEquals("1.2K", actual);
    }

    @Test
    public void testBetterNumberFormatShouldReturnTwoDecimalPlacesNumber() {
        String actual = java12.betterNumberFormat(1234L, 2);

        assertEquals("1.23K", actual);
    }
}