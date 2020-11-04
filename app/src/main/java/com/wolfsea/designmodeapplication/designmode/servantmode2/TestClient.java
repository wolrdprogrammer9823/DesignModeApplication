package com.wolfsea.designmodeapplication.designmode.servantmode2;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/11/5  0:35
 **/
public class TestClient {

    public static void main(String[] args) {

        Servant servant = new Servant();
        servant.doService(new ServiceA());

    }
}
