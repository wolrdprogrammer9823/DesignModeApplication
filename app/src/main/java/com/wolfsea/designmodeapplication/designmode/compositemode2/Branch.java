package com.wolfsea.designmodeapplication.designmode.compositemode2;
import java.util.ArrayList;

public class Branch implements IBranch {

    private ArrayList<ICrop> subOrdinateInfo = new ArrayList<>();

    private String name;
    private String jobPosition;
    private int salary;

    public Branch(String name, String jobPosition, int salary) {
        this.name = name;
        this.jobPosition = jobPosition;
        this.salary = salary;
    }

    @Override
    public void add(ICrop crop) {

        subOrdinateInfo.add(crop);
    }

    @Override
    public ArrayList<ICrop> getSubOrdinateInfo() {

        return subOrdinateInfo;
    }

    @Override
    public String getInfo() {

        return toString();
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                ", salary=" + salary;
    }
}
