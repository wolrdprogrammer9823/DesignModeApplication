package com.wolfsea.designmodeapplication.designmode.statemode3;

/**
 * @author liuliheng
 * @desc 停止状态类
 * @time 2020/10/31  16:07
 **/
public class StopState extends LiftState {

    @Override
    protected void open() {
        this.context.setLiftState(Context.openState);
        this.context.getLiftState().open();
    }

    @Override
    protected void close() {
         //do nothing
    }

    @Override
    protected void run() {
        this.context.setLiftState(Context.runState);
        this.context.getLiftState().run();
    }

    @Override
    protected void stop() {
        System.out.println("电梯停止运行了...");
    }
}
