package com.drinking_fountain;

public class Main {

    public static void main(String[] args) {

        Cup cup = new Cup(1);
        Drink drink = new Drink(Type.COLD_NORMAL, Size.MEDIUM);

        Distributor distributor = new Distributor(cup, drink);
        distributor.cupSizeChecker();
        drink.tempChanger();
        drink.tempChecker();
    }
}
