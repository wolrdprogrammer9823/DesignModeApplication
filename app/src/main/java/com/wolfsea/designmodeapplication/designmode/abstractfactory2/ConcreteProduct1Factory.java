package com.wolfsea.designmodeapplication.designmode.abstractfactory2;

public class ConcreteProduct1Factory extends Product1Factory {

    @Override
    public AbstractProductA createProductA1() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB1() {
        return new ConcreteProductB1();
    }
}
