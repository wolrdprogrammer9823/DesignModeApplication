package com.wolfsea.designmodeapplication.designmode.proxymode5;

public class GamePlayerProxy implements IGamePlayer, IProxy {

    private IGamePlayer gamePlayer;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String username, String password) {
        gamePlayer.login(username, password);
    }

    @Override
    public void killBoss() {
        gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        gamePlayer.upgrade();
        count();
    }

    @Override
    public IGamePlayer getProxy() {

        return this;
    }

    @Override
    public void count() {
        System.out.println("产生的费用为:150");
    }
}
