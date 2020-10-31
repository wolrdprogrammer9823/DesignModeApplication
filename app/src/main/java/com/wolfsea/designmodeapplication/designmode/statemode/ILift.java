package com.wolfsea.designmodeapplication.designmode.statemode;

/**
 * @author liuliheng
 * @desc  电梯接口类
 * @time 2020/10/31  10:49
 **/
public interface ILift {

    void open();

    void run();

    void close();

    void stop();
}
