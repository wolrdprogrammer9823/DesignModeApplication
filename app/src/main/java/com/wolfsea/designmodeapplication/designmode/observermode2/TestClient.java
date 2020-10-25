package com.wolfsea.designmodeapplication.designmode.observermode2;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/10/25  10:56
 **/
public class TestClient {

    public static void main(String[] args) {

        IHanFeiZhi hanFeiZhi = new HanFeiZhi();
        hanFeiZhi.haveBreakfast();

        System.out.println("===================================");

        hanFeiZhi.haveFun();
    }
}
