package com.wolfsea.designmodeapplication.designmode.buildermode2;

public class BMWCarModel2 extends CarModel2 {

    @Override
    protected void start() {
        System.out.println("宝马车启动了...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车引擎响起来了...");
    }

    @Override
    protected void ring() {
        System.out.println("宝马车鸣笛了...");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车停止了...");
    }
}
