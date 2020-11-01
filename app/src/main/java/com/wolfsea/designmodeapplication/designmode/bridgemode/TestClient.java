package com.wolfsea.designmodeapplication.designmode.bridgemode;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/11/1  22:29
 **/
public class TestClient {

    public static void main(String[] args) {

        HouseCorp houseCorp = new HouseCorp();
        houseCorp.makeMoney();

        System.out.println("================================");

        ClothesCorp clothesCorp = new ClothesCorp();
        clothesCorp.makeMoney();
    }
}
