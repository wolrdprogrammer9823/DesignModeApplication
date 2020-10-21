package com.wolfsea.designmodeapplication.designmode.compositemode;
import java.util.ArrayList;

public class TestClient {

    public static void main(String[] args) {

        IRoot root = new Root("李大大", "总经理", 20000);

        IBranch branch = new Branch("好大大1", "组长一", 12000);
        IBranch branch2 = new Branch("好大大2", "组长二", 11000);
        IBranch branch3 = new Branch("好大大3", "组长三", 13000);
        IBranch branch4 = new Branch("好大大4", "组长四", 10000);

        ILeaf leaf = new Leaf("彭大大10", "员工10", 8000);
        ILeaf leaf2 = new Leaf("彭大大11", "员工11", 6000);
        ILeaf leaf3 = new Leaf("彭大大12", "员工12", 8000);
        ILeaf leaf4 = new Leaf("彭大大13", "员工13", 7000);
        ILeaf leaf5 = new Leaf("彭大大14", "员工14", 6000);
        ILeaf leaf6 = new Leaf("彭大大15", "员工15", 8000);
        ILeaf leaf7 = new Leaf("彭大大16", "员工16", 6000);
        ILeaf leaf8 = new Leaf("彭大大17", "员工17", 8000);
        ILeaf leaf9 = new Leaf("彭大大18", "员工18", 8000);
        ILeaf leaf10 = new Leaf("彭大大19", "员工19", 6000);
        ILeaf leaf11 = new Leaf("彭大大20", "员工20", 7000);

        branch.add(branch3);
        branch.add(branch4);

        branch.add(leaf);
        branch.add(leaf2);
        branch.add(leaf3);
        branch.add(leaf4);

        branch2.add(leaf5);
        branch2.add(leaf6);

        branch3.add(leaf7);
        branch4.add(leaf8);

        root.add(branch);
        root.add(branch2);
        root.add(leaf9);
        root.add(leaf10);
        root.add(leaf11);

        System.out.println(root.getInfo());
        getSubOrdinateInfo(root.getSubOrdinateInfo());
    }

    public static void getSubOrdinateInfo(ArrayList subOrdinateInfo) {

        final int SIZE = subOrdinateInfo.size();
        for (int i = 0; i < SIZE; i++) {

            final Object object = subOrdinateInfo.get(i);
            if (object instanceof ILeaf) {

                ILeaf leaf = (ILeaf) object;
                System.out.println(leaf.getInfo());
            } else {

                IBranch branch = (IBranch) object;
                System.out.println(branch.getInfo());
                getSubOrdinateInfo(branch.getSubOrdinateInfo());
            }
        }
    }
}
