package com.wolfsea.designmodeapplication.designmode.proxymode;

public class GamePlayer implements IGamePlayer {

    @Override
    public void login(String username, String password) {

        System.out.println("当前登录用户为:" + username + ":,密码为:" + password);
    }

    @Override
    public void killBoss() {

        System.out.println("开始杀怪了...");
    }

    @Override
    public void upgrade() {

        System.out.println("今天又升级了...");
    }
}
