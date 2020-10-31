package com.wolfsea.designmodeapplication.designmode.statemode3;

/**
 * @author liuliheng
 * @desc 运行状态类
 * @time 2020/10/31  16:07
 **/
public class RunState extends LiftState {

    @Override
    protected void open() {
         //do nothing
    }

    @Override
    protected void close() {
       //do nothing
    }

    @Override
    protected void run() {
        System.out.println("电梯运行起来了...");
    }

    @Override
    protected void stop() {
        this.context.setLiftState(Context.stopState);
        this.context.getLiftState().stop();
    }
}
