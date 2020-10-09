package com.wolfsea.designmodeapplication.designmode.abstractfactory1;

public abstract class AbstractYellowHuman implements Human {

    @Override
    public void getColor() {

        System.out.println("我是黄种人。。。");
    }

    @Override
    public void talk() {

        System.out.println("我告诉你我生活在亚洲。。。");
    }
}
