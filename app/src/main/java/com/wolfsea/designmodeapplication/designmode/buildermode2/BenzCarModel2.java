package com.wolfsea.designmodeapplication.designmode.buildermode2;

public class BenzCarModel2 extends CarModel2 {
    @Override
    protected void start() {
        System.out.println("奔驰车启动起来了");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车引擎响起来了");
    }

    @Override
    protected void ring() {
        System.out.println("奔驰车鸣笛了");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车停止了");
    }
}
