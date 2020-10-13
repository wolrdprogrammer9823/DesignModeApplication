package com.wolfsea.designmodeapplication.designmode.proxymode7;
import java.lang.reflect.InvocationHandler;

public class TestDynamicClient {

    public static void main(String[] args) {

        Subject subject = new RealSubject();

        InvocationHandler invocationHandler = new MyInvocationHandler(subject);
        Subject proxy = ProxyDynamic.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), invocationHandler);
        proxy.doSomething();

        System.out.println("==========================");

        Subject proxy2 = SubjectDynamicProxy.newProxyInstance(subject);
        proxy2.doSomething();
    }
}
