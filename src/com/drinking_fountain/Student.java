package com.drinking_fountain;

public class Student {

    private final String name;
    private final Cup cup;

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
