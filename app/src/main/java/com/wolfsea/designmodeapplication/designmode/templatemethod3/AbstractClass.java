package com.wolfsea.designmodeapplication.designmode.templatemethod3;

public abstract class AbstractClass {

    protected abstract void doAnything();

    protected abstract void doSomething();

    public final void templateMethod() {
        doSomething();
        doAnything();
    }
}
