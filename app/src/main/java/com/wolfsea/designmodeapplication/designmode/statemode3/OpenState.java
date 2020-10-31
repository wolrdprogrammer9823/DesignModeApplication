package com.wolfsea.designmodeapplication.designmode.statemode3;

/**
 * @author liuliheng
 * @desc 打开状态类
 * @time 2020/10/31  16:07
 **/
public class OpenState extends LiftState {

    @Override
    protected void open() {
        System.out.println("电梯门打开了...");
    }

    @Override
    protected void close() {
        this.context.setLiftState(Context.closeState);
        this.context.getLiftState().close();
    }

    @Override
    protected void run() {
        //do nothing
    }

    @Override
    protected void stop() {
        this.context.setLiftState(Context.stopState);
        this.context.getLiftState().stop();
    }
}
