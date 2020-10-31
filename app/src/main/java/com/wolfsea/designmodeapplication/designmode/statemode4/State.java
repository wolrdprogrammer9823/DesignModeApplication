package com.wolfsea.designmodeapplication.designmode.statemode4;

/**
 * @author liuliheng
 * @desc  状态类
 * @time 2020/10/31  16:37
 **/
public abstract class State {

    protected Context context;

    public abstract void handle1();

    public abstract void handle2();

    public void setContext(Context context) {
        this.context = context;
    }
}
