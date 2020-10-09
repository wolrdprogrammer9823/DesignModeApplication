package com.wolfsea.designmodeapplication.designmode.templatemethod4;

public abstract class HummerModel {

    public abstract void start();

    protected boolean mIsAlarm = true;

    public final void run() {
        start();
        if (mIsAlarm()) {
            alarm();
        }
        engineBoom();
        stop();
    }

    public abstract void alarm();

    public abstract void engineBoom();

    public abstract void stop();

    public boolean mIsAlarm() {
        return mIsAlarm;
    }
}
