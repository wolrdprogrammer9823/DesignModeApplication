package com.wolfsea.designmodeapplication.designmode.bridgemode3;

/**
 * @author liuliheng
 * @desc 具体实现化角色
 * @time 2020/11/1  23:15
 **/
public class ConcreteImplementor implements Implementor {

    @Override
    public void doSomething() {

        System.out.println("ConcreteImplementor-->doSomething()");
    }

    @Override
    public void doAnyThing() {

        System.out.println("ConcreteImplementor-->doAnyThing()");
    }
}
