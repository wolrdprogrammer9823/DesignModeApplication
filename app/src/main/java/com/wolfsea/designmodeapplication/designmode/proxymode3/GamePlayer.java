package com.wolfsea.designmodeapplication.designmode.proxymode3;

public class GamePlayer implements IGamePlayer {

    private String name;

    public GamePlayer(IGamePlayer gamePlayer, String name) {

        if (gamePlayer == null) {

            throw new IllegalArgumentException("不能创建真实角色对象");
        }

        this.name = name;
    }

    @Override
    public void login(String username, String password) {

        System.out.println("登录名为:" + username + "的用户:" + this.name +"登录成功...");
    }

    @Override
    public void killBoss() {

        System.out.println("用户:" + name +"杀了一头打野怪...");
    }

    @Override
    public void upgrade() {

        System.out.println("用户:" + name +"又升了一级...");
    }
}
