package com.wolfsea.designmodeapplication.designmode.proxymode;

public class TestProxy {

    public static void main(String[] args) {

        GamePlayerProxy gamePlayerProxy = new GamePlayerProxy(new GamePlayer());
        gamePlayerProxy.login("tom", "123456");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();

    }
}
