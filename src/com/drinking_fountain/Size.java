package com.drinking_fountain;

public enum Size {
    SMALL(1),
    MEDIUM(3),
    LARGE(5);

    private final int dl;

    Size(int dl) {
        this.dl = dl;
    }

    public int getDl() {
        return this.dl;
    }
}
