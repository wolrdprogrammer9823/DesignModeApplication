package com.wolfsea.designmodeapplication.designmode.visitormode5;

/**
 * @author liuliheng
 * @desc 管理层人员
 * @time 2020/10/28  22:41
 **/
public class Manager extends Employee {

    private String performance;

    @Override
    protected void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }
}
