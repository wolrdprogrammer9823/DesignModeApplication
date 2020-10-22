package com.wolfsea.designmodeapplication.designmode.compositemode5;

import java.util.ArrayList;

public class Branch extends Component {

    private ArrayList<Component> componentArrayList = new ArrayList<>();

    public Branch(int number) {
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
}
