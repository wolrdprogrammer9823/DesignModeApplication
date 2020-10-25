package com.wolfsea.designmodeapplication.designmode.observermode4;

/**
 * @author liuliheng
 * @desc 观察者接口实现类
 * @time 2020/10/25  11:40
 **/
public class ConcreteObserver2 implements Observer {

    @Override
    public void update(String content) {

        System.out.println("ConcreteObserver2->观察到的内容为:" + content);
    }
}
