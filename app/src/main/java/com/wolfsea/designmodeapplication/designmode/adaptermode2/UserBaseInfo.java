package com.wolfsea.designmodeapplication.designmode.adaptermode2;
import java.util.HashMap;
import java.util.Map;

public class UserBaseInfo implements IUserBaseInfo {

    @Override
    public Map<String, String> getUserBaseInfo() {

        Map<String, String> baseInfoMap = new HashMap<>();
        baseInfoMap.put(Constants.USER_NAME, "匡杜大");
        baseInfoMap.put(Constants.MOBILE_NUMBER , "91234341413");
        return baseInfoMap;
    }
}
