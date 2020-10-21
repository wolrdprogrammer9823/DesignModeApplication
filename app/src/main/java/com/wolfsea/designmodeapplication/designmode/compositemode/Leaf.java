package com.wolfsea.designmodeapplication.designmode.compositemode;

public class Leaf implements ILeaf{

    private String name;
    private String jobPosition;
    private int salary;

    public Leaf(String name, String jobPosition, int salary) {
        this.name = name;
        this.jobPosition = jobPosition;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return toString();
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "name='" + name + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                ", salary=" + salary +
                '}';
    }
}
