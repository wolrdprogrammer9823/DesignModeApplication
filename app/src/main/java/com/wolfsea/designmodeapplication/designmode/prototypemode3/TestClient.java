package com.wolfsea.designmodeapplication.designmode.prototypemode3;

public class TestClient {

    public static void main(String[] args) throws CloneNotSupportedException {

        Thing thing = new Thing();
        thing.doSomething();

        System.out.println("================================");

        //clone创建对象不会调用构造方法
        Thing cloneThing = thing.clone();
        cloneThing.doSomething();
    }
}
