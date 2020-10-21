package com.drinking_fountain;

public enum Type {
    COLD_FIZZY(-1),
    COLD_NORMAL(-2),
    HOT_NORMAL(3);

    private int temp;

    Type(int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }
}
