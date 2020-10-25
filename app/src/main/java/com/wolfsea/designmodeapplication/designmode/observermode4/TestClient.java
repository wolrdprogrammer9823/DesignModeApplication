package com.wolfsea.designmodeapplication.designmode.observermode4;

/**
 * @author liuliheng
 * @desc
 * @time 2020/10/25  11:45
 **/
public class TestClient {

    public static void main(String[] args) {

        Object object = new ConcreteObject();

        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();

        object.addObserver(observer1);
        object.addObserver(observer2);

        object.doSomething("杀了一头牛...");
        object.notifyChange();
    }
}
