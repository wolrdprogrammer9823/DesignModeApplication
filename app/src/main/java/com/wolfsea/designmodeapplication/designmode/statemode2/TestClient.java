package com.wolfsea.designmodeapplication.designmode.statemode2;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/10/31  10:51
 **/
public class TestClient {

    public static void main(String[] args) {

        Lift lift = new Lift();
        lift.setState(ILift.STOP_STATE);
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
