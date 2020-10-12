package com.wolfsea.designmodeapplication.designmode.proxymode3;

public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer;

    public GamePlayerProxy(String name) {

        gamePlayer = new GamePlayer(this, name);
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
    }
}
