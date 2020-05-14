package com.richard.danis.www.java.twelve;

import org.junit.Test;

public class NewStringFormatTest {

    @Test
    public void testStringIndentFunction() {
        String result = "foo\nbar\njohn".indent(4);
        System.out.println("Result: \n" + result + "\nlength: " + result.length());
    }

    @Test
    public void testStringTransform() {
        var result = "foo"
                .transform(input -> input + " bar")
                .transform(String::toUpperCase);
        System.out.println(result);
    }
}
