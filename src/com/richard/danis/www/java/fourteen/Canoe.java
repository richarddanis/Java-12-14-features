package com.richard.danis.www.java.fourteen;

public record Canoe(String hobbyName) implements Hobbies {

    @Override
    public String doAmazingHobby() {
        return "pull";
    }
}
