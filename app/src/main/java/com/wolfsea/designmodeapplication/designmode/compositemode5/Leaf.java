package com.wolfsea.designmodeapplication.designmode.compositemode5;
import java.util.ArrayList;

public class Leaf extends Component {

    public Leaf(int number) {
        super(number);
    }

    @Override
    @Deprecated
    protected void add(Component component) {

        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    protected void remove(Component component) {

        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    protected ArrayList<Component> getChildren() {

        throw new UnsupportedOperationException();
    }
}
