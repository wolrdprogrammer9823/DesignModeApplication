package com.wolfsea.designmodeapplication.designmode.proxymode7;

public class RealSubject implements Subject {
    @Override
    public void doSomething() {

        System.out.println("doSomething");
    }
}
