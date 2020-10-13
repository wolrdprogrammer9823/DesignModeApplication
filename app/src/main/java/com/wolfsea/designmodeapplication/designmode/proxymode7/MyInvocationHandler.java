package com.wolfsea.designmodeapplication.designmode.proxymode7;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    //被代理的对象
    private Object proxyObject;

    public MyInvocationHandler(Object proxyObject) {
        this.proxyObject = proxyObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(proxyObject, args);
        return result;
    }
}
