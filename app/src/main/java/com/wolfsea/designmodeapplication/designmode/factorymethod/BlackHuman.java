package com.wolfsea.designmodeapplication.designmode.factorymethod;

public class BlackHuman implements IHuman {

    @Override
    public void getColor() {

        System.out.println("黑种人...黑种人");
    }

    @Override
    public void talk() {

        System.out.println("听不懂...听不懂");
    }
}
