package com.wolfsea.designmodeapplication.designmode.prototypemode3;
import androidx.annotation.NonNull;

public class Thing implements Cloneable {

    public Thing() {

        System.out.println("执行了构造方法...");
    }

    public void doSomething() {

        System.out.println("public void doSomething()");
    }

    @NonNull
    @Override
    protected Thing clone() throws CloneNotSupportedException {
        return (Thing) super.clone();
    }

}
