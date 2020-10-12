package com.wolfsea.designmodeapplication.designmode.buildermode;

public class BenzCarModel1 extends CarModel1 {

    @Override
    protected void start() {
        System.out.println("奔驰启动了...");
    }

    @Override
    protected void ring() {
        System.out.println("奔驰鸣笛了...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰引擎响起来了...");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰停止了...");
    }

    @Override
    protected void run() {
        start();
        engineBoom();
        ring();
        stop();
    }
}
