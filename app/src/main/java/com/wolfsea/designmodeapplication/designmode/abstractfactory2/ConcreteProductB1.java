package com.wolfsea.designmodeapplication.designmode.abstractfactory2;

public class ConcreteProductB1 extends AbstractProductB {

    @Override
    public void commonProperty() {

        System.out.println("属于产品B系列");
    }

    @Override
    public void doAction() {

        System.out.println("生成产品B1的具体过程...");
    }
}
