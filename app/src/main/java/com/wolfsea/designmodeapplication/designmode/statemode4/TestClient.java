package com.wolfsea.designmodeapplication.designmode.statemode4;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/10/31  16:42
 **/
public class TestClient {

    public static void main(String[] args) {

        Context context = new Context();
        context.setState(new Concrete1State());
        context.handle1();

        context.setState(new Concrete2State());
        context.handle2();
    }
}
