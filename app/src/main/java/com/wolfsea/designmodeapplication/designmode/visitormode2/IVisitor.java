package com.wolfsea.designmodeapplication.designmode.visitormode2;

/**
 * @author liuliheng
 * @desc  访问者接口
 * @time 2020/10/28  23:09
 **/
public interface IVisitor {

    //访问普通职员
    void visit(CommonEmployee commonEmployee);

    //访问管理人员
    void visit(Manager manager);
}
