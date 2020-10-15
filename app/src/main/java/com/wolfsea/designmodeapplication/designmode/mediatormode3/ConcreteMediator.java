package com.wolfsea.designmodeapplication.designmode.mediatormode3;

public class ConcreteMediator extends AbstractMediator {

    @Override
    public void doSomething1() {

        executeWork1();
    }

    @Override
    public void doSomething2() {

        executeWork2();
    }

    private void executeWork1() {

        System.out.println("executeWork1()");
    }

    private void executeWork2() {

        System.out.println("executeWork2()");
    }
}
