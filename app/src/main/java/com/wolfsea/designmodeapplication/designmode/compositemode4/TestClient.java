package com.wolfsea.designmodeapplication.designmode.compositemode4;

public class TestClient {

    public static void main(String[] args) {

        Composite root = new ConcreteComposite(1);
        Composite branch2 = new ConcreteComposite(2);
        Composite branch3 = new ConcreteComposite(3);
        Composite branch4 = new ConcreteComposite(4);
        Composite branch5 = new ConcreteComposite(5);

        Component leaf6 = new Leaf(6);
        Component leaf7 = new Leaf(7);
        Component leaf8 = new Leaf(8);
        Component leaf9 = new Leaf(9);
        Component leaf10 = new Leaf(10);
        Component leaf11 = new Leaf(11);

        root.add(branch2);
        root.add(branch3);
        root.add(branch4);
        root.add(branch5);

        branch2.add(branch3);
        branch2.add(branch4);

        branch3.add(leaf6);
        branch4.add(leaf7);

        branch5.add(leaf8);
        branch5.add(leaf9);
        branch5.add(leaf10);
        branch5.add(leaf11);

        root.doSomething();

        display(root);
    }

    public static void display(Component component) {
        for (Component subComponent : ((Composite)component).getChildren()) {
            if (subComponent instanceof Leaf) {

                subComponent.doSomething();
            } else {

                subComponent.doSomething();
                display(subComponent);
            }
        }
    }
}
