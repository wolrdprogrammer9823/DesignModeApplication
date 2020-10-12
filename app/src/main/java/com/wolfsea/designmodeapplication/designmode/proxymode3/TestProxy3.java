package com.wolfsea.designmodeapplication.designmode.proxymode3;

public class TestProxy3 {

    public static void main(String[] args) {

        IGamePlayer gamePlayer = new GamePlayerProxy("张三");
        gamePlayer.login("zhangshan", "password");
        gamePlayer.killBoss();
        gamePlayer.upgrade();
    }
}
