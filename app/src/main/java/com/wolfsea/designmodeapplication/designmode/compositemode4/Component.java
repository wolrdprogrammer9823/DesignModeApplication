package com.wolfsea.designmodeapplication.designmode.compositemode4;

public abstract class Component {

    protected int number;

    public Component(int number) {
        this.number = number;
    }

    protected abstract void doSomething();
}
