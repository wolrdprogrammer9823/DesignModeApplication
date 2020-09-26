package com.wolfsea.designmodeapplication.designmode.singletonmode2;

public class Minister {

    public static void main(String[] args) {

        final int SIZE = 5;

        for (int i = 0; i < SIZE; i++) {

            System.out.print("大臣" + (i + 1) + ":朝拜的是:");
            Emperor2.getInstance().say();
        }
    }

}
