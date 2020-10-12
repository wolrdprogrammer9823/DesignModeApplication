package com.wolfsea.designmodeapplication.designmode.proxymode2;

public class RealSubject implements Subject {

    @Override
    public void request() {

        System.out.println("This is a request...");

    }

}
