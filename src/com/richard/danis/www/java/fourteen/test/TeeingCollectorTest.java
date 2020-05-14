package com.richard.danis.www.java.fourteen.test;

import com.richard.danis.www.java.fourteen.model.Person;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class TeeingCollectorTest {

    @Test
    public void testTeeingCollector() {
        List<Person> personlist = Arrays.asList(
                new Person(null, "Foo", "Bar", 19),
                new Person(null, "John", "Doe", 22),
                new Person(null, "Test", "Name", 24),
                new Person(null, "First", "Lst", 35));

        HashMap<String, Object> result = personlist.stream().collect(
                Collectors.teeing(
                        Collectors.filtering(e -> e.age() > 23, Collectors.toList()),
                        Collectors.filtering(e -> e.age() > 23, Collectors.counting()),
                        (list, count) -> {
                            HashMap<String, Object> map = new HashMap();
                            map.put("list", list);
                            map.put("count", count);
                            return map; }
                                 ));

        System.out.println(result);
    }
}
