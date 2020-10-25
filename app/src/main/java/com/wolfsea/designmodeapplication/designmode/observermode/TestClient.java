package com.wolfsea.designmodeapplication.designmode.observermode;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/10/25  10:33
 **/
public class TestClient {

    public static void main(String[] args) {

        LiShi liShi = new LiShi();
        HanFeiZhi hanFeiZhi = new HanFeiZhi();
        Spy spy = new Spy(hanFeiZhi, liShi, Constants.HAVE_BREAKFAST);
        spy.start();

        hanFeiZhi.haveBreakfast();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        spy.setType(Constants.HAVE_FUN);
        hanFeiZhi.haveFun();
    }
}
