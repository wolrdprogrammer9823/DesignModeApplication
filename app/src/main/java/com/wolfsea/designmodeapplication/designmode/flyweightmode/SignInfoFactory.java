package com.wolfsea.designmodeapplication.designmode.flyweightmode;

/**
 * @author liuliheng
 * @desc  工厂类
 * @time 2020/11/1  10:52
 **/
public class SignInfoFactory {

    public static SignInfo getSignInfo() {

        return new SignInfo();
    }
}
