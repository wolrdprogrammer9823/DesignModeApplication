package com.wolfsea.designmodeapplication.designmode.singletonmode;

public class Minister {

    public static void main(String[] args) {

        final int size = 3;

        for (int i = 0; i < size; i++) {

            Emperor.getInstance().say();
        }
    }

}
