package com.wolfsea.designmodeapplication.designmode.proxymode4;

public interface IGamePlayer {

    void login(String username, String password);

    void killBoss();

    void upgrade();

    IGamePlayer getProxy();
}
