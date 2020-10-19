package com.wolfsea.designmodeapplication.designmode.decoratemode4;

public class TestDecorator {

    public static void main(String[] args) {

        Component component = new ConcreteComponent();
        //第一次装饰
        component = new ConcreteDecorator1(component);
        //第二次装饰
        component = new ConcreteDecorator2(component);

        component.operate();

    }
}
