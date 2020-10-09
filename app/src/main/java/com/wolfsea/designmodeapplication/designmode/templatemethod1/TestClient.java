package com.wolfsea.designmodeapplication.designmode.templatemethod1;

public class TestClient {

    public static void main(String[] args) {

        HummerModel hummerModel = new HummerModelA();
        hummerModel.run();

        System.out.println("============================");

        hummerModel = new HummerModelB();
        hummerModel.run();
    }
}
