package com.wolfsea.designmodeapplication.designmode.decoratemode4;

public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        doSomething1();
        super.operate();
    }

    private void doSomething1() {

        System.out.println("ConcreteDecorator1--->doSomething1()");
    }
}
