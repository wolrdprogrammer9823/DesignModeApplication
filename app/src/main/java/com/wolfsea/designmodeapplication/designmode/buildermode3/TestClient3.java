package com.wolfsea.designmodeapplication.designmode.buildermode3;

public class TestClient3 {

    public static void main(String[] args) {

        CarDirector3 carDirector3 = new CarDirector3();

        for (int i = 0; i < 10; i++) {

            carDirector3.buildABenCarModel3().run();

            System.out.println("======================================");
        }

        System.out.println("======================================");

        for (int i = 0; i < 5; i++) {

            carDirector3.buildCBMWCarModel3().run();

            System.out.println("======================================");
        }
    }
}
