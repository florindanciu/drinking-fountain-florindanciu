package com.drinking_fountain;

public class Drink {

    private final Type type;
    private final Size size;

    public Drink(Type type, Size size) {
        this.type = type;
        this.size = size;
    }

    public Type getType() {
        return type;
    }

    public Size getSize() {
        return size;
    }

}
