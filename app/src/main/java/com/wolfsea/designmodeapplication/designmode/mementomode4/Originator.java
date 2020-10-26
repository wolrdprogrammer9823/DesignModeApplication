package com.wolfsea.designmodeapplication.designmode.mementomode4;

/**
 * @author liuliheng
 * @desc  发起者
 * @time 2020/10/27  0:39
 **/
public class Originator {

    private String state;

    public Memento createMemento() {

        return new Memento(state);
    }

    public void restoreMemento(Memento memento) {

        this.setState(memento.getState());
    }

    public void changeState() {

        this.state = "后天是星期三了哦...";
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
