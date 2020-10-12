package com.wolfsea.designmodeapplication.designmode.proxymode;

public class GamePlayerProxy implements IGamePlayer {

    private GamePlayer gamePlayer;

    public GamePlayerProxy(GamePlayer gamePlayer) {

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
    }
}
