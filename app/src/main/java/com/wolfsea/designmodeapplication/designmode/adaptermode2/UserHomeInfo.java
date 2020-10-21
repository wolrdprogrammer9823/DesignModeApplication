package com.wolfsea.designmodeapplication.designmode.adaptermode2;
import java.util.HashMap;
import java.util.Map;

public class UserHomeInfo implements IUserHomeInfo {

    @Override
    public Map<String, String> getUserHomeInfo() {

        Map<String, String> homeInfoMap = new HashMap<>();
        homeInfoMap.put(Constants.HOME_ADDRESS, "广东深圳");
        homeInfoMap.put(Constants.HOME_TEL_NUMBER, "90341341413");
        return homeInfoMap;
    }
}
