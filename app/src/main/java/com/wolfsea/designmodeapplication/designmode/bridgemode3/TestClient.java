package com.wolfsea.designmodeapplication.designmode.bridgemode3;

/**
 * @author liuliheng
 * @desc 测试类
 * @time 2020/11/1  23:19
 **/
public class TestClient {

    public static void main(String[] args) {

        //定义实现化角色
        Implementor implementor = new ConcreteImplementor();
        //定义抽象化角色
        Abstraction abstraction = new RefindedAbstraction(implementor);
        abstraction.request();
    }
}
