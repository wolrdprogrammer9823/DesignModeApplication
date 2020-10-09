package com.wolfsea.designmodeapplication.designmode.templatemethod2;

public abstract class HummerModel {

    public abstract void start();

    public final void run() {
        start();
        alarm();
        engineBoom();
        start();
    }

    public abstract void alarm();

    public abstract void engineBoom();

    public abstract void stop();
}
