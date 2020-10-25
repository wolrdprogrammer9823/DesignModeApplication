package com.wolfsea.designmodeapplication.designmode.observermode4;

/**
 * @author liuliheng
 * @desc 主题接口
 * @time 2020/10/25  11:41
 **/
public interface Object {

    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyChange();

    void doSomething(String something);
}
