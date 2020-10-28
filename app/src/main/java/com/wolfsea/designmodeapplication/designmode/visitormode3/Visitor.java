package com.wolfsea.designmodeapplication.designmode.visitormode3;

/**
 * @author liuliheng
 * @desc 具体访问者
 * @time 2020/10/29  0:03
 **/
public class Visitor implements IVisitor {

    @Override
    public void visitElement(ConcreteElement1 element) {
        element.doSomething1();
    }

    @Override
    public void visitElement(ConcreteElement2 element) {
        element.doSomething2();
    }
}
