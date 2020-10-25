package com.wolfsea.designmodeapplication.designmode.observermode4;
import java.util.Vector;

/**
 * @author liuliheng
 * @desc 具体主题
 * @time 2020/10/25  11:42
 **/
public class ConcreteObject implements Object {

    private String content = "";

    private Vector<Observer> observerVector = new Vector<>();

    @Override
    public void addObserver(Observer observer) {

        observerVector.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {

        observerVector.remove(observer);
    }

    @Override
    public void notifyChange() {
        for (Observer observer : observerVector) {

            observer.update(content);
        }
    }

    @Override
    public void doSomething(String something) {

        content = something;
    }
}
