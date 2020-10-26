package com.wolfsea.designmodeapplication.designmode.mementomode3;

/**
 * @author liuliheng
 * @desc  备忘录对象
 * @time 2020/10/27  0:15
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
