package com.wolfsea.designmodeapplication.designmode.statemode3;

/**
 * @author liuliheng
 * @desc  上下文类
 * @time 2020/10/31  16:05
 **/
public class Context {

    private LiftState liftState;

    public static final OpenState openState = new OpenState();
    public static final CloseState closeState = new CloseState();
    public static final RunState runState = new RunState();
    public static final StopState stopState = new StopState();

    public void open() {
        this.openState.open();
    }

    public void close() {
        this.closeState.close();
    }

    public void run() {
        this.runState.run();
    }

    public void stop() {
        this.stopState.stop();
    }

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        //把当前的实现类通知到各个实现类中去
        this.liftState.setContext(this);
    }
}
