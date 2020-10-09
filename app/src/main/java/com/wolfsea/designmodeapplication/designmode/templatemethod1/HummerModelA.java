package com.wolfsea.designmodeapplication.designmode.templatemethod1;

public class HummerModelA extends HummerModel {

    @Override
    public void start() {

        System.out.println("悍马模型A启动了....");
    }

    @Override
    public void run() {

        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }

    @Override
    public void alarm() {

        System.out.println("悍马模型A鸣笛了....");
    }

    @Override
    public void engineBoom() {

        System.out.println("悍马模型A引擎响起来了....");
    }

    @Override
    public void stop() {

        System.out.println("悍马模型A停止了");
    }
}
