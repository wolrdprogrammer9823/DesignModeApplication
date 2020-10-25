package com.wolfsea.designmodeapplication.designmode.facademode4;

/**
 * @author liuliheng
 * @desc 测试类
 * @time 2020/10/25  21:07
 **/
public class TestClient {

    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
        facade.methodC();
    }
}
