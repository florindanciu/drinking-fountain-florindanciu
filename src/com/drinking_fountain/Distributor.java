package com.drinking_fountain;

public class Distributor {

    private final Cup cup;
    private final Drink drink;

    public Distributor(Cup cup, Drink drink) {
        this.cup = cup;
        this.drink = drink;
    }

    public void cupSizeChecker() {
        if (cup.getVolume() < drink.getSize().getDl()) {
            System.out.println("Your drink size is " + drink.getSize().getDl() +
                    "dl, please use a bigger cup.");
        } else {
            System.out.println("Enjoy your drink :)");
        }
    }
}
