package com.wolfsea.designmodeapplication.designmode.proxymode4;

public class TestGamePlayer {

    public static void main(String[] args) {

        //情形一
//        IGamePlayer gamePlayer = new GamePlayer("张三");
//        gamePlayer.login("zhangshan", "password");
//        gamePlayer.killBoss();
//        gamePlayer.upgrade();


        //情形二
//        IGamePlayer gamePlayer = new GamePlayer("LiSi");
//        IGamePlayer gamePlayerProxy = new GamePlayerProxy(gamePlayer);
//        gamePlayerProxy.login("zhangshan", "password");
//        gamePlayerProxy.killBoss();
//        gamePlayerProxy.upgrade();

        //情形三
        IGamePlayer gamePlayer = new GamePlayer("liheng");
        IGamePlayer gamePlayerProxy = gamePlayer.getProxy();
        gamePlayerProxy.login("liheng", "heng6890");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();
    }
}
