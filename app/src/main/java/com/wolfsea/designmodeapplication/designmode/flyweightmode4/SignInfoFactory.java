package com.wolfsea.designmodeapplication.designmode.flyweightmode4;
import java.util.HashMap;

/**
 * @author liuliheng
 * @desc  工厂类
 * @time 2020/11/1  10:52
 **/
public class SignInfoFactory {

    private static final HashMap<ExtrinsicState, SignInfo> poolHashMap = new HashMap<>();

    @Deprecated
    public static SignInfo getSignInfo() {

        return new SignInfo();
    }

    public static SignInfo getSignInfo(ExtrinsicState extrinsicState) {

        SignInfo signInfo;

        boolean notContainsKey = !poolHashMap.containsKey(extrinsicState);
        if (notContainsKey) {

            signInfo = new SignInfoPool(extrinsicState);
            poolHashMap.put(extrinsicState, signInfo);
        } else {

            signInfo = poolHashMap.get(extrinsicState);
        }

        return signInfo;
    }
}
