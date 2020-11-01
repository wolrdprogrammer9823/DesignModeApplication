package com.wolfsea.designmodeapplication.designmode.bridgemode;

/**
 * @author liuliheng
 * @desc  抽象类
 * @time 2020/11/1  22:24
 **/
public abstract class Corp {

    //生成
    public abstract void produce();

    //销售
    public abstract void sell();

    public void makeMoney() {
        this.produce();
        this.sell();
    }
}
