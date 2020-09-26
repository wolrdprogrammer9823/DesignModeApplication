package com.wolfsea.designmodeapplication.designmode.factorymethod4;

public class Client {

    public static void main(String[] args) {

        SingletonFactory.createInstance().doSomething();
    }
}
