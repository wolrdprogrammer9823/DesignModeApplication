package com.wolfsea.designmodeapplication.designmode.factorymethod;

public class WhiteHuman implements IHuman {

    @Override
    public void getColor() {

        System.out.println("白种人...白种人");
    }

    @Override
    public void talk() {

        System.out.println("说英语...说英语");
    }
}
