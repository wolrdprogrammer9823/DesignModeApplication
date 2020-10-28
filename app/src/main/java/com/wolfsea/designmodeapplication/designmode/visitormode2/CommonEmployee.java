package com.wolfsea.designmodeapplication.designmode.visitormode2;

/**
 * @author liuliheng
 * @desc 普通雇员类
 * @time 2020/10/28  22:40
 **/
public class CommonEmployee extends Employee {

    private int salary;

    @Override
    protected void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
