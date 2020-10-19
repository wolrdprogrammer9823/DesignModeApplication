package com.wolfsea.designmodeapplication.designmode.decoratemode4;

public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        super.operate();
        doSomething2();
    }

    private void doSomething2() {

        System.out.println("ConcreteDecorator2--->doSomething2()");
    }
}
