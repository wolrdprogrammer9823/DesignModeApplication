package com.wolfsea.designmodeapplication.designmode.statemode4;

/**
 * @author liuliheng
 * @desc  上下文类
 * @time 2020/10/31  16:37
 **/
public class Context {

    private State state;

    public void handle1() {

        state.handle1();
        state.handle2();
    }

    public void handle2() {

        state.handle1();
        state.handle2();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        this.state.setContext(this);
    }
}
