package com.wolfsea.designmodeapplication.designmode.templatemethod4;

public class HummerModelB extends HummerModel {

    @Override
    public void start() {

        System.out.println("悍马模型B启动了....");
    }


    @Override
    public void alarm() {

        System.out.println("悍马模型B鸣笛了....");
    }

    @Override
    public void engineBoom() {

        System.out.println("悍马模型B引擎响起来了....");
    }

    @Override
    public void stop() {

        System.out.println("悍马模型B停止了");
    }

    public void setAlarm(boolean alarm) {
        this.mIsAlarm = alarm;
    }
}
