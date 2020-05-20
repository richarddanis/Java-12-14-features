package com.richard.danis.www.java.fourteen.test;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test Java 14 String text blocks
 */
public class TextBlockTest {

    @Test
    public void testGivenATextWithCarriageReturnsThenItContainsBoth() {
        String textBlock = """
                separated with\r
                carriage returns""";

        Assert.assertEquals(textBlock, "separated with\r\ncarriage returns");
    }

    @Test
    public void testGivenAStringWithEscapesSpacesThenTheResultHasLinesEndingWithSpaces() {
        String textBlock = """
                line 1        
                line 2       \s
                """;
        Assert.assertEquals(textBlock, "line 1\nline 2        \n");
    }

    @Test
    public void testLineTermination(){
        String textBlock = """
                John Doe \
                new line\
                """;
        Assert.assertEquals(textBlock, "John Doe new line");
    }
}
