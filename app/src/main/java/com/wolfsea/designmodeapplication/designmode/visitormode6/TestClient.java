package com.wolfsea.designmodeapplication.designmode.visitormode6;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/10/29  1:18
 **/
public class TestClient {

    public static void main(String[] args) {

        AbstractActor actor = new YoungActor();
        Role role = new KongFuRole();
        role.accept(actor);
    }
}
