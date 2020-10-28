package com.wolfsea.designmodeapplication.designmode.visitormode3;

/**
 * @author liuliheng
 * @desc 具体元素
 * @time 2020/10/29  0:01
 **/
public class ConcreteElement2 extends Element {

    public void doSomething2() {}

    @Override
    protected void accept(IVisitor visitor) {

        visitor.visitElement(this);
    }
}
