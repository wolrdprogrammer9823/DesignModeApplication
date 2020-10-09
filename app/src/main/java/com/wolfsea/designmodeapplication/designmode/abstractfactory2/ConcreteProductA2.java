package com.wolfsea.designmodeapplication.designmode.abstractfactory2;

public class ConcreteProductA2 extends AbstractProductA {

    @Override
    public void commonProperty() {

        System.out.println("属于产品A系列");
    }

    @Override
    public void doAction() {

        System.out.println("生成产品A2的具体过程...");
    }
}
