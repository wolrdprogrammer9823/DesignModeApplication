package com.wolfsea.designmodeapplication.designmode.visitormode2;

/**
 * @author liuliheng
 * @desc  抽象雇员类
 * @time 2020/10/28  22:35
 **/
public abstract class Employee {

    public static final int MALE = 0;
    public static final int FEMALE = 1;

    private String name;

    private int sex;

    private String job;

    protected abstract void accept(IVisitor visitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
