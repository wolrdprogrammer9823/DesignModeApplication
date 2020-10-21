package com.wolfsea.designmodeapplication.designmode.compositemode;

import java.util.ArrayList;

public class Root implements IRoot {

    private ArrayList subOrdinateInfo = new ArrayList();

    private String name;
    private String jobPosition;
    private int salary;

    public Root(String name, String jobPosition, int salary) {
        this.name = name;
        this.jobPosition = jobPosition;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return toString();
    }

    @Override
    public void add(IBranch branch) {
        subOrdinateInfo.add(branch);
    }

    @Override
    public void add(ILeaf leaf) {
        subOrdinateInfo.add(leaf);
    }

    @Override
    public ArrayList getSubOrdinateInfo() {
        return subOrdinateInfo;
    }

    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                ", salary=" + salary +
                '}';
    }
}
