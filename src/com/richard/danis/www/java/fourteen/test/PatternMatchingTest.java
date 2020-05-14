package com.richard.danis.www.java.fourteen.test;

import com.richard.danis.www.java.fourteen.model.Person;
import org.junit.Test;

public class PatternMatchingTest {

    @Test
    public void testPatternMatching() {
        Object obj = new Person(null, "test", "test", 22);
        if (obj instanceof Person person) {
            System.out.println(person.age());
        }
    }
}
