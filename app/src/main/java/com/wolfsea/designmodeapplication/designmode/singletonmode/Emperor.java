package com.wolfsea.designmodeapplication.designmode.singletonmode;

public class Emperor {

    private static final Emperor emperor = new Emperor();

    private Emperor() {}

    public static Emperor getInstance() {
        return emperor;
    }

    public void say() {
        System.out.println("开始发话了...");
    }
}
