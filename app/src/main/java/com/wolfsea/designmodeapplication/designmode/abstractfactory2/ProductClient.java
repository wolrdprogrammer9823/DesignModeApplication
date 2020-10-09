package com.wolfsea.designmodeapplication.designmode.abstractfactory2;

public class ProductClient {

    public static void main(String[] args) {

        Product1Factory product1Factory = new ConcreteProduct1Factory();
        AbstractProductA productA = product1Factory.createProductA1();
        productA.commonProperty();
        productA.doAction();

        System.out.println("==================================");

        AbstractProductB productB = product1Factory.createProductB1();
        productB.commonProperty();
        productB.doAction();
    }
}
