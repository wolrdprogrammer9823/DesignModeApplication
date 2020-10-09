package com.wolfsea.designmodeapplication.designmode.abstractfactory1;

public abstract class AbstractWhiteHuman implements Human {

    @Override
    public void getColor() {

        System.out.println("我是白种人。。。");
    }

    @Override
    public void talk() {

        System.out.println("我告诉你我生活在美洲。。。");
    }
}
