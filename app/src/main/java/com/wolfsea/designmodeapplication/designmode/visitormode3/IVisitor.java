package com.wolfsea.designmodeapplication.designmode.visitormode3;

/**
 * @author liuliheng
 * @desc  访问者接口
 * @time 2020/10/29  0:00
 **/
public interface IVisitor {

    void visitElement(ConcreteElement1 element);

    void visitElement(ConcreteElement2 element);
}
