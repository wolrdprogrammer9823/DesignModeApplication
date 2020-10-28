package com.wolfsea.designmodeapplication.designmode.visitormode;

/**
 * @author liuliheng
 * @desc 管理层人员
 * @time 2020/10/28  22:41
 **/
public class Manager extends Employee {

    private String performance;

    @Override
    protected String getOtherInfo() {

        String otherInfo = "我是一个管理人员,我的考核绩效为:" + getPerformance();
        return otherInfo;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }
}
