package com.wolfsea.designmodeapplication.designmode.mementomode6;

/**
 * @author liuliheng
 * @desc  备忘录发起者
 * @time 2020/10/27  23:14
 **/
public class Originator {

    private String state1 = "";
    private String state2 = "";
    private String state3 = "";

    public Memento createMemento() {

        return new Memento(BeanUtils.backProp(this));
    }

    public void restoreMemento(Memento memento) {

        BeanUtils.restoreProp(this, memento.getStateMap());
    }

    public String getState1() {
        return state1;
    }

    public void setState1(String state1) {
        this.state1 = state1;
    }

    public String getState2() {
        return state2;
    }

    public void setState2(String state2) {
        this.state2 = state2;
    }

    public String getState3() {
        return state3;
    }

    public void setState3(String state3) {
        this.state3 = state3;
    }
}
