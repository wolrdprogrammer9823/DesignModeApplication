package com.wolfsea.designmodeapplication.designmode.compositemode4;

import java.util.ArrayList;

public abstract class Composite extends Component {

    public Composite(int number) {
        super(number);
    }

    protected abstract void add(Component component);

    protected abstract void remove(Component component);

    protected abstract ArrayList<Component> getChildren();
}
