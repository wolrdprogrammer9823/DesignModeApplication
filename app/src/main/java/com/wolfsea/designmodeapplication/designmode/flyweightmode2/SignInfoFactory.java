package com.wolfsea.designmodeapplication.designmode.flyweightmode2;
import java.util.HashMap;

/**
 * @author liuliheng
 * @desc  工厂类
 * @time 2020/11/1  10:52
 **/
public class SignInfoFactory {

    private static final HashMap<String, SignInfo> poolHashMap = new HashMap<>();

    @Deprecated
    public static SignInfo getSignInfo() {

        return new SignInfo();
    }

    public static SignInfo getSignInfo(String key) {

        SignInfo signInfo;

        boolean notContainsKey = !poolHashMap.containsKey(key);
        if (notContainsKey) {

            //signInfo = new SignInfoPool(key);
            signInfo = new SignInfo();
            poolHashMap.put(key, signInfo);
        } else {

            signInfo = poolHashMap.get(key);
        }

        return signInfo;
    }
}
