package com.wolfsea.designmodeapplication.designmode.statemode3;

/**
 * @author liuliheng
 * @desc 关闭状态类
 * @time 2020/10/31  16:07
 **/
public class CloseState extends LiftState {

    @Override
    protected void open() {
        this.context.setLiftState(Context.openState);
        this.context.getLiftState().open();
    }

    @Override
    protected void close() {

        System.out.println("电梯门关闭了...");
    }

    @Override
    protected void run() {
        this.context.setLiftState(Context.runState);
        this.context.getLiftState().run();
    }

    @Override
    protected void stop() {
        //do nothing
    }
}
