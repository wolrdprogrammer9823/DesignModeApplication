package com.wolfsea.designmodeapplication.designmode.factorymethod;

public class YellowHuman implements IHuman {

    @Override
    public void getColor() {

        System.out.println("黄种人...黄种人");
    }

    @Override
    public void talk() {

        System.out.println("说汉字...说汉字");
    }
}
