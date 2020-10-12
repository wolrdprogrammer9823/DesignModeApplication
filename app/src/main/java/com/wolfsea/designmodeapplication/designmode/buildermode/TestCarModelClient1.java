package com.wolfsea.designmodeapplication.designmode.buildermode;

public class TestCarModelClient1 {

    public static void main(String[] args) {

        CarModel1 carModel1 = new BenzCarModel1();
        carModel1.run();

        System.out.println("===========================");

        carModel1 = new BMWCarModel1();
        carModel1.run();
    }
}
