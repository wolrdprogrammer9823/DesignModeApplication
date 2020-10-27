package com.wolfsea.designmodeapplication.designmode.mementomode7;

/**
 * @author liuliheng
 * @desc  发起人
 * @time 2020/10/27  23:46
 **/
public class Originator {

    private String state = "";

    public Memento createMemento() {

        return new Memento(state);
    }

    public void restoreMemento(Memento memento) {

        this.setState(memento.getState());
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    static class Memento implements IMemento {

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
}
