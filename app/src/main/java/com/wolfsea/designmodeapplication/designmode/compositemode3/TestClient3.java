package com.wolfsea.designmodeapplication.designmode.compositemode3;
import java.util.ArrayList;

public class TestClient3 {

    public static void main(String[] args) {

        AbsBranch root = new Branch("李大大", "总经理", 20000);

        AbsBranch branch = new Branch("好大大1", "组长一", 12000);
        AbsBranch branch2 = new Branch("好大大2", "组长二", 11000);
        AbsBranch branch3 = new Branch("好大大3", "组长三", 13000);
        AbsBranch branch4 = new Branch("好大大4", "组长四", 10000);

        Crop leaf = new Leaf("彭大大10", "员工10", 8000);
        Crop leaf2 = new Leaf("彭大大11", "员工11", 6000);
        Crop leaf3 = new Leaf("彭大大12", "员工12", 8000);
        Crop leaf4 = new Leaf("彭大大13", "员工13", 7000);
        Crop leaf5 = new Leaf("彭大大14", "员工14", 6000);
        Crop leaf6 = new Leaf("彭大大15", "员工15", 8000);
        Crop leaf7 = new Leaf("彭大大16", "员工16", 6000);
        Crop leaf8 = new Leaf("彭大大17", "员工17", 8000);
        Crop leaf9 = new Leaf("彭大大18", "员工18", 8000);
        Crop leaf10 = new Leaf("彭大大19", "员工19", 6000);
        Crop leaf11 = new Leaf("彭大大20", "员工20", 7000);

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

        System.out.println(root.toString());
        getSubOrdinateInfo(root.getSubOrdinateInfo());

        System.out.println(leaf8.getParent().toString());
    }

    public static void getSubOrdinateInfo(ArrayList<Crop> subOrdinateInfo) {

        final int SIZE = subOrdinateInfo.size();
        for (int i = 0; i < SIZE; i++) {

            final Crop crop = subOrdinateInfo.get(i);
            if (crop instanceof Leaf) {

                Leaf leaf = (Leaf) crop;
                System.out.println(leaf.toString());
            } else {

                AbsBranch absBranch = (AbsBranch) crop;
                System.out.println(absBranch.toString());
                getSubOrdinateInfo(absBranch.getSubOrdinateInfo());
            }
        }

    }
}
