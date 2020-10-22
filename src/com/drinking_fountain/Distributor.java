package com.drinking_fountain;

public class Distributor {

    private int overallTemp = 60;

    public Distributor() {
        setInfoMessage();
    }

    private void setInfoMessage() {
        System.out.println("Info: max temperature is 90 degrees celsius" + System.lineSeparator());
    }

    public void requestDrink(Student student, Drink drink) {

        if (overallTemp >= 90) {
            System.out.println(student.getName() + ", temperature to high, please come back later!");
            return;
        }

        else if (student.getCup().getVolume() < drink.getSize().getValue()) {
            System.out.println(student.getName() + ", your drink size is " + drink.getSize().getValue() +
                    "dl, please use a bigger cup." + System.lineSeparator());
            return;
        }

        System.out.println("Actual temperature: " + this.overallTemp);
        System.out.println(student.getName() + ", enjoy your " + drink.getType().name() + System.lineSeparator());
        overallTemp += tempChanger(drink);
    }

    private int tempChanger(Drink drink) {
        return drink.getSize().getValue() * drink.getType().getTemp();
    }
}
