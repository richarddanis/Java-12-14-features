package com.richard.danis.www.java.fourteen;

public record Person(String firstName,String lastName, int age) {

    public Person(String firstName, String lastName)

    public String fullName(){
        return firstName + " " + lastName;
    }
}
