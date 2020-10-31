package com.wolfsea.designmodeapplication.designmode.statemode3;

/**
 * @author liuliheng
 * @desc  电梯状态类
 * @time 2020/10/31  16:04
 **/
public abstract class LiftState {

    public Context context;

    protected abstract void open();

    protected abstract void close();

    protected abstract void run();

    protected abstract void stop();

    public void setContext(Context context) {
        this.context = context;
    }
}
