package com.richard.danis.www.java.fourteen;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

/**
 * DTO to store person object.
 *
 * Java 14 (preview)
 * javap -v -p Person.class -> bytecode
 */
public record Person<T extends Hobbies>(T hobby, @NotNull String firstName, String lastName, int age) implements Serializable {

    public String fullName() {
        return firstName + " " + lastName;
    }
}
