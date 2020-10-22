package com.drinking_fountain;

public class Student {

    private final Cup cup;
    private String name;

    public Student(String name, Cup cup) {
        this.cup = cup;
        this.name = name;
    }

    public Cup getCup() {
        return cup;
    }

    public String getName() {
        return name;
    }
}
