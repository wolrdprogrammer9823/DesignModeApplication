package com.wolfsea.designmodeapplication.designmode.compositemode4;

public class Leaf extends Component {

    public Leaf(int number) {
        super(number);
    }

    @Override
    protected void doSomething() {

        System.out.println("Leaf:" + number + "--->doSomething");
    }
}
