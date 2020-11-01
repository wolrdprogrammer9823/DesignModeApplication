package com.wolfsea.designmodeapplication.designmode.bridgemode3;

/**
 * @author liuliheng
 * @desc  抽象化角色
 * @time 2020/11/1  23:16
 **/
public abstract class Abstraction {

    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void request() {

        this.implementor.doSomething();
        this.implementor.doAnyThing();
    }

    public Implementor getImplementor() {
        return implementor;
    }
}
