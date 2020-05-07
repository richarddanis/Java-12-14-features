package com.richard.danis.www.java.fourteen.test;

import com.richard.danis.www.java.fourteen.model.Canoe;
import com.richard.danis.www.java.fourteen.model.Hobbies;
import com.richard.danis.www.java.fourteen.model.Person;
import org.junit.Test;

/**
 * Test the {@link Person} record class.
 */
public class RecordTest {

    @Test
    public void testRecordClass() {
        //check this -> javap -v -p Person.class
        //https://aboullaite.me/java-14-records/
        Person person = new Person(new Canoe("canoe"), "foo", " bar", 12);
        Hobbies hobby = person.hobby();
        System.out.println(hobby.doAmazingHobby());
        System.out.println(person);
    }
}
