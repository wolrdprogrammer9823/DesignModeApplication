package com.wolfsea.designmodeapplication.designmode.adaptermode;

public class TestAdapterClient {

    public static void main(String[] args) {

        //类适配器
        IUserInfo userInfo = new UserInfo();
        userInfo.getHomeAddress();
        userInfo.getHomeTelNumber();

        System.out.println("============================");

        userInfo = new OuterUserInfo();
        userInfo.getHomeAddress();
        userInfo.getHomeTelNumber();
    }
}
