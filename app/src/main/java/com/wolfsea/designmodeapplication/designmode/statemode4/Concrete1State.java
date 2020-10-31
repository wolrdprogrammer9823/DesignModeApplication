package com.wolfsea.designmodeapplication.designmode.statemode4;

/**
 * @author liuliheng
 * @desc 具体状态类
 * @time 2020/10/31  16:39
 **/
public class Concrete1State extends State {
    @Override
    public void handle1() {
        System.out.println("Concrete1Sate->handle1");
    }

    @Override
    public void handle2() {
        System.out.println("Concrete1Sate->handle2");
    }
}
