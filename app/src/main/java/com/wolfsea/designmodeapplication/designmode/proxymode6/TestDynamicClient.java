package com.wolfsea.designmodeapplication.designmode.proxymode6;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestDynamicClient {

    public static void main(String[] args) {

        IGamePlayer gamePlayer = new GamePlayer("data one");
        InvocationHandler gamePlayerIH = new GamePlayerIH(gamePlayer);

        ClassLoader classLoader = gamePlayer.getClass().getClassLoader();

        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader, new Class[]{IGamePlayer.class}, gamePlayerIH);
        proxy.login("tutu", "908771");
        proxy.killBoss();
        proxy.upgrade();
    }
}
