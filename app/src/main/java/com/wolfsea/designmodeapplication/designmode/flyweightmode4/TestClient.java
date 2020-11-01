package com.wolfsea.designmodeapplication.designmode.flyweightmode4;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/11/1  10:52
 **/
public class TestClient {

    public static void main(String[] args) {

        ExtrinsicState extrinsicState1 = new ExtrinsicState();
        extrinsicState1.setSubject("科目二");
        extrinsicState1.setLocation("深圳");
        SignInfoFactory.getSignInfo(extrinsicState1);

        ExtrinsicState extrinsicState2 = new ExtrinsicState();
        extrinsicState2.setSubject("科目三");
        extrinsicState2.setLocation("上海");
        SignInfoFactory.getSignInfo(extrinsicState2);

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {

            SignInfoFactory.getSignInfo(extrinsicState2);
        }

        System.out.println("times:" + (System.currentTimeMillis() - startTime));
    }
}
