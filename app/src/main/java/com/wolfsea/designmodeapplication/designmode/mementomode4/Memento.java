package com.wolfsea.designmodeapplication.designmode.mementomode4;

/**
 * @author liuliheng
 * @desc  备忘录
 * @time 2020/10/27  0:39
 **/
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
