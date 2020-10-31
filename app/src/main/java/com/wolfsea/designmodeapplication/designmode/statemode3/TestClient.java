package com.wolfsea.designmodeapplication.designmode.statemode3;

/**
 * @author liuliheng
 * @desc 测试类
 * @time 2020/10/31  16:25
 **/
public class TestClient {

    public static void main(String[] args) {

        Context context = new Context();
        context.setLiftState(new CloseState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
