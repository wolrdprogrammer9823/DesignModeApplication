package com.wolfsea.designmodeapplication.designmode.visitormode3;

/**
 * @author liuliheng
 * @desc 具体元素
 * @time 2020/10/29  0:01
 **/
public class ConcreteElement1 extends Element {

    public void doSomething1() {}

    @Override
    protected void accept(IVisitor visitor) {

        visitor.visitElement(this);
    }
}
