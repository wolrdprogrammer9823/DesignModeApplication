package com.wolfsea.designmodeapplication.designmode.adaptermode;
import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {

    @Override
    public Map<String,String> getUserHomeInfo() {

        Map<String, String> homeInfoMap = new HashMap<>();
        homeInfoMap.put(Constants.HOME_ADDRESS, "广东深圳");
        homeInfoMap.put(Constants.HOME_TEL_NUMBER, "90341341413");
        return homeInfoMap;
    }

    @Override
    public Map<String,String> getUserBaseInfo() {

        Map<String, String> baseInfoMap = new HashMap<>();
        baseInfoMap.put(Constants.USER_NAME, "匡杜大");
        baseInfoMap.put(Constants.MOBILE_NUMBER , "91234341413");
        return baseInfoMap;
    }

    @Override
    public Map<String,String> getUserOfficeInfo() {

        Map<String, String> officeInfoMap = new HashMap<>();
        officeInfoMap.put(Constants.OFFICE_TEL_NUMBER, "503117897441");
        officeInfoMap.put(Constants.JOB_POSITION , "投资经理");
        return officeInfoMap;
    }
}
