package com.wolfsea.designmodeapplication.designmode.compositemode4;
import java.util.ArrayList;

public class ConcreteComposite extends Composite {

    private ArrayList<Component> componentArrayList = new ArrayList<>();

    public ConcreteComposite(int number) {
        super(number);
    }

    @Override
    protected void add(Component component) {

        componentArrayList.add(component);
    }

    @Override
    protected void remove(Component component) {

        componentArrayList.remove(component);
    }

    @Override
    protected ArrayList<Component> getChildren() {

        return componentArrayList;
    }

    @Override
    protected void doSomething() {

        System.out.println("ConcreteComposite:" + number + "--->doSomething()");
    }
}
