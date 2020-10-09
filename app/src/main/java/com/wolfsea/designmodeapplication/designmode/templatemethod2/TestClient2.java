package com.wolfsea.designmodeapplication.designmode.templatemethod2;

public class TestClient2 {

    public static void main(String[] args) {

        HummerModel hummerModel = new HummerModelA();
        hummerModel.run();

        System.out.println("==============================");

        hummerModel = new HummerModelB();
        hummerModel.run();
    }
}
