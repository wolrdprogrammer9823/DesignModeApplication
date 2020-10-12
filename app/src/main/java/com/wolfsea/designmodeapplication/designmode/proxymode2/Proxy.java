package com.wolfsea.designmodeapplication.designmode.proxymode2;

public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject) {

        this.subject = subject;
    }

    public Proxy(Object... objects) {


    }

    public void beforeRequest() {}

    @Override
    public void request() {
        beforeRequest();
        subject.request();
        afterRequest();
    }

    public void afterRequest() {}
}
