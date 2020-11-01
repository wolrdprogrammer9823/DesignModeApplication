package com.wolfsea.designmodeapplication.designmode.bridgemode3;

/**
 * @author liuliheng
 * @desc 修正抽象化角色
 * @time 2020/11/1  23:18
 **/
public class RefindedAbstraction extends Abstraction {

    public RefindedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void request() {

        //业务处理
        super.request();
        //getImplementor().doAnyThing();
    }
}
