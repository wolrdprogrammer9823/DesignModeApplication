package com.wolfsea.designmodeapplication.designmode.adaptermode2;

public class TestAdapterClient2 {

    public static void main(String[] args) {

        //对象适配器
        IUserBaseInfo userBaseInfo = new UserBaseInfo();
        IUserHomeInfo userHomeInfo = new UserHomeInfo();
        IUserOfficeInfo userOfficeInfo = new UserOfficeInfo();

        OuterUserInfo outerUserInfo = new OuterUserInfo(userBaseInfo, userHomeInfo, userOfficeInfo);
        outerUserInfo.getHomeAddress();
        outerUserInfo.getHomeTelNumber();
    }
}
