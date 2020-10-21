package com.wolfsea.designmodeapplication.designmode.adaptermode2;
import java.util.HashMap;
import java.util.Map;

public class UserOfficeInfo implements IUserOfficeInfo {

    @Override
    public Map<String, String> getUserOfficeInfo() {

        Map<String, String> officeInfoMap = new HashMap<>();
        officeInfoMap.put(Constants.OFFICE_TEL_NUMBER, "503117897441");
        officeInfoMap.put(Constants.JOB_POSITION , "投资经理");
        return officeInfoMap;
    }
}
