package com.wolfsea.designmodeapplication.designmode.observermode3;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author liuliheng
 * @desc  实现类
 * @time 2020/10/25  10:17
 **/
public class HanFeiZhi implements IHanFeiZhi,Observable {

    private CopyOnWriteArrayList<Observer> observers = new CopyOnWriteArrayList<>();

    private String content = "";

    @Override
    public void haveBreakfast() {

        System.out.println("韩非子正在吃早饭...");
        content = "在吃早饭...";
    }

    @Override
    public void haveFun() {

        System.out.println("韩非子正在娱乐...");
        content = "在娱乐...";
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {

        observers.remove(observer);
    }

    @Override
    public void notifyChange() {
        for (Observer observer : observers) {

            observer.update(content);
        }
    }
}
