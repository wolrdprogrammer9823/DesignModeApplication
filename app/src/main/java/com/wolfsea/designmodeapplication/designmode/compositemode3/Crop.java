package com.wolfsea.designmodeapplication.designmode.compositemode3;

public abstract class Crop {

    private String name;
    private String jobPosition;
    private int salary;

    private Crop parent;

    public Crop getParent() {
        return parent;
    }

    protected void setParent(Crop parent) {
        this.parent = parent;
    }

    public Crop(String name, String jobPosition, int salary) {

        this.name = name;
        this.jobPosition = jobPosition;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                ", salary=" + salary;
    }
}
