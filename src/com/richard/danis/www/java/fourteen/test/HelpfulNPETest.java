package com.richard.danis.www.java.fourteen.test;

import com.richard.danis.www.java.fourteen.model.Person;
import org.junit.Test;

public class HelpfulNPETest {

    @Test
    public void testHelpfulNPE(){
        Person person = new Person(null, "test", "test", 22);
        person.hobby().doAmazingHobby();
    }
}
