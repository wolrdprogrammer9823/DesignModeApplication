package com.wolfsea.designmodeapplication.designmode.commandmode2;

public class ConcreteReceiver1 extends Receiver {

    @Override
    protected void doSomething1() {

        System.out.println("ConcreteReceiver1--doSomething1()");
    }

    @Override
    protected void doSomething2() {
        System.out.println("ConcreteReceiver1--doSomething2()");
    }
}
