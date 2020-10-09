package com.wolfsea.designmodeapplication.designmode.templatemethod4;

public class TestTemplate {

    public static void main(String[] args) {

        HummerModel hummerModel = new HummerModelA();
        hummerModel.run();

        System.out.println("==================================");

        hummerModel = new HummerModelB();
        hummerModel.mIsAlarm = true;
        hummerModel.run();
    }
}
