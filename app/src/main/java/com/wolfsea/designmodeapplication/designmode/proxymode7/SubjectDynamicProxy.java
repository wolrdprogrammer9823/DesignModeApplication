package com.wolfsea.designmodeapplication.designmode.proxymode7;
import java.lang.reflect.InvocationHandler;

public class SubjectDynamicProxy extends ProxyDynamic {

    public static <T> T newProxyInstance(Object object) {

        ClassLoader classLoader = object.getClass().getClassLoader();
        Class<?>[] interfaces = object.getClass().getInterfaces();
        InvocationHandler invocationHandler = new MyInvocationHandler(object);
        return newProxyInstance(classLoader, interfaces, invocationHandler);
    }
}
