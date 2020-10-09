package com.wolfsea.designmodeapplication.designmode.abstractfactory1;

public abstract class AbstractBlackHuman implements Human {

    @Override
    public void getColor() {

        System.out.println("我是黑种人。。。");
    }

    @Override
    public void talk() {

        System.out.println("我告诉你我生活在非洲。。。");
    }
}
