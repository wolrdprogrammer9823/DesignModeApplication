package com.wolfsea.designmodeapplication.designmode.proxymode6;

public class GamePlayer implements IGamePlayer {

    private String name;

    public GamePlayer(String name) {

        this.name = name;
    }


    @Override
    public void login(String username, String password) {
        System.out.println("登陆名为:" + username +"的用户" + this.name +"登录成功...");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在杀怪...");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + "今天升级了...");
    }
}
