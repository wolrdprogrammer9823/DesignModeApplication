package com.wolfsea.designmodeapplication.designmode.statemode;

/**
 * @author liuliheng
 * @desc 电梯实现类
 * @time 2020/10/31  10:50
 **/
public class Lift implements ILift {

    @Override
    public void open() {

        System.out.println("电梯门打开了...");
    }

    @Override
    public void run() {

        System.out.println("电梯运行起来了...");
    }

    @Override
    public void close() {

        System.out.println("电梯门关闭了...");
    }

    @Override
    public void stop() {

        System.out.println("电梯停止运行了...");
    }
}
