package com.wolfsea.designmodeapplication.designmode.buildermode;

public class BMWCarModel1 extends CarModel1 {

    @Override
    protected void start() {
        System.out.println("宝马启动了...");
    }

    @Override
    protected void ring() {
        System.out.println("宝马鸣笛了...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马引擎响起来了...");
    }

    @Override
    protected void stop() {
        System.out.println("宝马停止了...");
    }

    @Override
    protected void run() {
        start();
        engineBoom();
        ring();
        stop();
    }
}