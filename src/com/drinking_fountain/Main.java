package com.drinking_fountain;

public class Main {

    public static void main(String[] args) {

        Distributor distributor = new Distributor();

        Student student1 = new Student("Fred", new Cup());
        Student student2 = new Student("Florin", new Cup());
        Student student3 = new Student("Mike", new Cup());
        Student student4 = new Student("John", new Cup());
        Student student5 = new Student("Bill", new Cup());

        distributor.requestDrink(student1, student1.getCup(), new Drink(Type.HOT_NORMAL, Size.MEDIUM));
        distributor.requestDrink(student2, student2.getCup(), new Drink(Type.COLD_NORMAL, Size.SMALL));
        distributor.requestDrink(student3, student3.getCup(), new Drink(Type.HOT_NORMAL, Size.LARGE));
        distributor.requestDrink(student4, student4.getCup(), new Drink(Type.COLD_FIZZY, Size.MEDIUM));
        distributor.requestDrink(student5, student5.getCup(), new Drink(Type.HOT_NORMAL, Size.LARGE));



    }
}
