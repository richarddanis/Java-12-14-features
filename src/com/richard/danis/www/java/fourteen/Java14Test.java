package com.richard.danis.www.java.fourteen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Java14Test {

    private String expect;
    private String input;

    public Java14Test(String input, String expect) {
        this.expect = expect;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection inputs() {
        return Arrays.asList(new Object[][]{
                {"M", "MWF"},
                {"W", "MWF"},
                {"F", "MWF"},
                {"T", "TTS"},
                {"TH", "TTS"},
                {"S", "TTS"},
                {"", "Please insert a valid day."},
                {"ZS", "Looks like a Sunday."}
        });
    }

    @Test
    public void testSwitchStatement() {
        String actual = switch (input) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            default -> {
                if (input.isEmpty())
                    yield "Please insert a valid day.";
                else
                    yield "Looks like a Sunday.";
            }

        };

        assertEquals(expect, actual);
    }

    @Test
    public void testRecordClass(){
        //check this -> javap -v -p Person.class
        //https://aboullaite.me/java-14-records/
        Person person = new Person("test", "1");
        Person person1 = new Person("test", "1", 2);
    }
}
