package com.wolfsea.designmodeapplication.designmode.proxymode6;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerIH implements InvocationHandler {

    //被代理的对象
    private Object gamePlayer;

    public GamePlayerIH(Object gamePlayer) {

        this.gamePlayer = gamePlayer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(gamePlayer, args);
        if (method.getName().equalsIgnoreCase("killBoss")) {
            System.out.println("有人在用我的号登录...");
        }
        return result;
    }
}
