package com.wolfsea.designmodeapplication.designmode.compositemode5;

public class TestClient {

    public static void main(String[] args) {

        Component root = new Branch(1);
        Component branch2 = new Branch(2);
        Component branch3 = new Branch(3);
        Component branch4 = new Branch(4);
        Component branch5 = new Branch(5);

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

        System.out.println("Component->" + root.toString());

        display(root);
    }

    public static void display(Component component) {
        for (Component subComponent : component.getChildren()) {
            if (subComponent instanceof Leaf) {

                System.out.println("Leaf->" + subComponent.toString());
            } else {

                System.out.println("Component->" + subComponent.toString());
                display(subComponent);
            }
        }
    }
}
