package com.wolfsea.designmodeapplication.designmode.bridgemode2;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/11/1  22:57
 **/
public class TestClient {

    public static void main(String[] args) {

        Clothes clothes = new Clothes();
        //IPod iPod = new IPod();
        ShangZhaiCorp shangZhaiCorp = new ShangZhaiCorp(clothes);
        shangZhaiCorp.makeMoney();

        System.out.println("=================================");

        House house = new House();
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();
    }
}
