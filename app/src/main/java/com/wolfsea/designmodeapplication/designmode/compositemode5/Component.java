package com.wolfsea.designmodeapplication.designmode.compositemode5;

import java.util.ArrayList;

public abstract class Component {

    protected int number;

    public Component(int number) {
        this.number = number;
    }

    protected abstract void add(Component component);

    protected abstract void remove(Component component);

    protected abstract ArrayList<Component> getChildren();

    @Override
    public String toString() {
        return "number=" + number;
    }
}
