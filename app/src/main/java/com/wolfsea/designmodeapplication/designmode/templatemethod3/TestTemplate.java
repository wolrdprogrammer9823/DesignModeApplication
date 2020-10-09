package com.wolfsea.designmodeapplication.designmode.templatemethod3;

public class TestTemplate {

    public static void main(String[] args) {

        AbstractClass abstractClass = new ConcreteClassA();
        abstractClass.templateMethod();

        System.out.println("==============================");

        abstractClass = new ConcreteClassB();
        abstractClass.templateMethod();
    }
}
