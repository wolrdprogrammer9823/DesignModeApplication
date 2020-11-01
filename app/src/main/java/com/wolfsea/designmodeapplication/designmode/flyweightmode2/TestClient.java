package com.wolfsea.designmodeapplication.designmode.flyweightmode2;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/11/1  10:52
 **/
public class TestClient {

    public static void main(String[] args) {

//        for (int i = 0; i < 4; i++) {
//
//            String subject = "科目:" + i;
//
//            for (int j = 0; j < 10; j++) {
//
//                String address = subject + ",考试地点:" + j;
//
//                SignInfo signInfo = SignInfoFactory.getSignInfo(address);
//            }
//        }

        SignInfoFactory.getSignInfo("科目一");
        SignInfoFactory.getSignInfo("科目二");
        SignInfoFactory.getSignInfo("科目三");
        SignInfoFactory.getSignInfo("科目四");

//        SignInfo signInfo = SignInfoFactory.getSignInfo("科目二");
//        while (true) {
//
//            signInfo.setId("111");
//            signInfo.setLocation("111");
//            new MultiThread(signInfo).start();
//
//            signInfo.setId("222");
//            signInfo.setLocation("222");
//            new MultiThread(signInfo).start();
//        }

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {

            SignInfoFactory.getSignInfo("科目二");
        }

        System.out.println("times:" + (System.currentTimeMillis() - startTime));

    }
}
