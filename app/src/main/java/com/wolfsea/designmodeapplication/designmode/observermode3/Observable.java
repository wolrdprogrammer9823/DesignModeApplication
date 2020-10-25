package com.wolfsea.designmodeapplication.designmode.observermode3;

/**
 * @author liuliheng
 * @desc  被观察者接口
 * @time 2020/10/25  11:12
 **/
public interface Observable {

    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyChange();
}
