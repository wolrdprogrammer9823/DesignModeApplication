package com.wolfsea.designmodeapplication.designmode.visitormode6;

/**
 * @author liuliheng
 * @desc  测试类2
 * @time 2020/10/29  1:25
 **/
public class TestClient2 {

    public static void main(String[] args) {

        Role role = new KongFuRole();
        AbstractActor actor = new YoungActor();
        actor.act(role);

        IdiotRole idiotRole = new IdiotRole();
        actor.act(idiotRole);

        // Person person = new Person()
        // Person person为静态类型;new Person()为实际类型
        //静态分派:由静态类型决定调用哪一个方法,在java中对应的场景为方法重载.
        //动态分派:由实际类型决定调用哪一个方法,在java中对应的场景为方法重写.
    }
}
