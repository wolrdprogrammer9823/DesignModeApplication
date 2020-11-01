package com.wolfsea.designmodeapplication.designmode.flyweightmode;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/11/1  10:52
 **/
public class TestClient {

    public static void main(String[] args) {

        SignInfo signInfo = SignInfoFactory.getSignInfo();
        System.out.println(signInfo);
    }
}
