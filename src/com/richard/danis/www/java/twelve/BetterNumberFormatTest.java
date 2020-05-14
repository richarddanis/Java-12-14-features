package com.richard.danis.www.java.twelve;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class BetterNumberFormatTest {

    private BetterNumberFormatAndSwitch betterNumberFormat;

    @BeforeEach
    public void init() {
        betterNumberFormat = new BetterNumberFormatAndSwitch();
    }

    @Test
    public void testNewSwitchExpression() {
        String actual = betterNumberFormat.newSwitchExpression("M");

        assertEquals("MWF", actual);
    }

    @Test
    public void testBetterNumberFormatShouldReturnOneDecimalPlacesNumber() {
        String actual = betterNumberFormat.betterNumberFormat(1234L, 1);

        assertEquals("1.2K", actual);
    }

    @Test
    public void testBetterNumberFormatShouldReturnTwoDecimalPlacesNumber() {
        String actual = betterNumberFormat.betterNumberFormat(1234L, 2);

        assertEquals("1.23K", actual);
    }
}