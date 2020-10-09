package com.wolfsea.designmodeapplication.designmode.templatemethod3;

public class ConcreteClassB extends AbstractClass {

    @Override
    protected void doAnything() {
        System.out.println("ConcreteClassB...doAnything()");
    }

    @Override
    protected void doSomething() {
        System.out.println("ConcreteClassB...doSomething()");
    }
}
