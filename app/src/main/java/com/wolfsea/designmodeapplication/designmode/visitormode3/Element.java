package com.wolfsea.designmodeapplication.designmode.visitormode3;

/**
 * @author liuliheng
 * @desc  抽象元素
 * @time 2020/10/28  23:59
 **/
public abstract class Element {

    protected abstract void accept(IVisitor visitor);
}
