package com.wolfsea.designmodeapplication.designmode.abstractfactory2;

public class ConcreteProductB2 extends AbstractProductB {

    @Override
    public void commonProperty() {

        System.out.println("属于产品B系列");
    }

    @Override
    public void doAction() {

        System.out.println("生成产品B2的具体过程...");
    }
}
