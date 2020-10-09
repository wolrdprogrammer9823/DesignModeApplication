package com.wolfsea.designmodeapplication.designmode.templatemethod3;

public class ConcreteClassA extends AbstractClass {

    @Override
    protected void doAnything() {
        System.out.println("ConcreteClassA...doAnything()");
    }

    @Override
    protected void doSomething() {
        System.out.println("ConcreteClassA...doSomething()");
    }
}
