package com.wolfsea.designmodeapplication.designmode.statemode2;

/**
 * @author liuliheng
 * @desc  电梯接口类
 * @time 2020/10/31  10:49
 **/
public interface ILift {

    int OPEN_STATE = 0x01;
    int CLOSE_STATE = 0x02;
    int RUN_STATE = 0x03;
    int STOP_STATE = 0x04;

    void open();

    void run();

    void close();

    void stop();
}
