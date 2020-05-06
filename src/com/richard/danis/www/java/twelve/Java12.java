package com.richard.danis.www.java.twelve;

import java.text.NumberFormat;
import java.util.Locale;

public class Java12 {

    public String newSwitchExpression(String day) {
        return switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            default -> "Not day.";
        };
    }

    public String betterNumberFormat(Long number, int maxFractionDigits) {
        NumberFormat numberFormat = NumberFormat
                .getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);
        numberFormat.setMaximumFractionDigits(maxFractionDigits);
        return numberFormat.format(number);
    }
}
