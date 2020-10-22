package com.drinking_fountain;

public enum Size {
    SMALL(1),
    MEDIUM(3),
    LARGE(5);

    private final int value;

    Size(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
