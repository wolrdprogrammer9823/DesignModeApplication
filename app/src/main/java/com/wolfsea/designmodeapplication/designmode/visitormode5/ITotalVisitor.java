package com.wolfsea.designmodeapplication.designmode.visitormode5;

/**
 * @author liuliheng
 * @desc 汇总访问者
 * @time 2020/10/29  0:46
 **/
public interface ITotalVisitor extends IVisitor {

    //统计薪水
    int getTotalSalary();
}
