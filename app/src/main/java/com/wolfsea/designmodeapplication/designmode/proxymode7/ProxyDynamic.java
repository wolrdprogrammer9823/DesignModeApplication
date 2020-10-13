package com.wolfsea.designmodeapplication.designmode.proxymode7;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyDynamic<T>  {

    public static <T> T newProxyInstance(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler h) {

        //接入连接点
        if (true) {

            new BeforeAdvice().advice();
        }

        return (T)Proxy.newProxyInstance(classLoader, interfaces, h);
    }
}
