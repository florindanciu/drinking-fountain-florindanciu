package com.drinking_fountain;

public class Drink {

    private final Type type;
    private final Size size;
    private int drinkTemp;

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

    public int getDrinkTemp() {
        return drinkTemp;
    }

    public void tempChanger() {
        this.drinkTemp = getSize().getDl() * getType().getTemp();
    }

    public void tempChecker() {
        if (this.drinkTemp >= 90) {
            System.out.println("Danger, beverage to hot to drink!");
        }
        System.out.println("Your beverage temperature is: " + getDrinkTemp());
    }
}
