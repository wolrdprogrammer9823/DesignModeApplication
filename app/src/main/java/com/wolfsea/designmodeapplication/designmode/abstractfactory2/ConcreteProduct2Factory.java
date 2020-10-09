package com.wolfsea.designmodeapplication.designmode.abstractfactory2;

public class ConcreteProduct2Factory extends Product2Factory {

    @Override
    public AbstractProductA createProductA2() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB2() {
        return new ConcreteProductB2();
    }
}
