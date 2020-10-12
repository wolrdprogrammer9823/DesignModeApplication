package com.wolfsea.designmodeapplication.designmode.proxymode4;

public class GamePlayer implements IGamePlayer {

    private String name;
    private IGamePlayer gamePlayer;

    public GamePlayer(String name) {

        this.name = name;
    }

    @Override
    public void login(String username, String password) {
        if (mIsTargetProxy()) {
            System.out.println("用户名为:" + this.name +",的用户上线了...");
        } else {
            System.out.println("请使用指定的代理角色...");
        }
    }

    @Override
    public void killBoss() {
        if (mIsTargetProxy()) {
            System.out.println("用户名为:" + this.name +"开始大杀四方了...");
        } else {
            System.out.println("请使用指定的代理角色...");
        }
    }

    @Override
    public void upgrade() {
        if (mIsTargetProxy()) {
            System.out.println("用户名为:" + this.name +"升级了...");
        } else {
            System.out.println("请使用指定的代理角色...");
        }
    }

    @Override
    public IGamePlayer getProxy() {
        gamePlayer = new GamePlayerProxy(this);
        return gamePlayer;
    }

    private boolean mIsTargetProxy() {
        return gamePlayer != null;
    }
}
