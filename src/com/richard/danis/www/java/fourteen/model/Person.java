package com.richard.danis.www.java.fourteen.model;

import org.jetbrains.annotations.NotNull;

/**
 * DTO to store person object.
 * <p>
 * Java 14 (preview)
 * javap -v -p Person.class -> bytecode
 */
public record Person<T extends Hobbies>(T hobby, @NotNull String firstName, String lastName,
                                        int age) {

    public String fullName() {
        return firstName + " " + lastName;
    }
}
