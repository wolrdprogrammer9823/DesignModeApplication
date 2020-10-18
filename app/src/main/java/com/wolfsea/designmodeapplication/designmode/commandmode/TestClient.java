package com.wolfsea.designmodeapplication.designmode.commandmode;

public class TestClient {
    public static void main(String[] args) {

        Group group = new CodeGroup();
        group.find();
        group.plan();
        group.add();
        group.change();
        group.delete();

        System.out.println("===================");

        group = new PageGroup();
        group.find();
        group.plan();
        group.add();
        group.change();
        group.delete();

        System.out.println("=======================");

        group = new RequirementGroup();
        group.find();
        group.plan();
        group.add();
        group.change();
        group.delete();
    }
}
