package com.wolfsea.designmodeapplication.designmode.observermode3;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/10/25  11:21
 **/
public class TestClient {

    public static void main(String[] args) {

        HanFeiZhi hanFeiZhi = new HanFeiZhi();

        LiShi liShi = new LiShi();
        ZanShi zanShi = new ZanShi();
        WangShi wangShi = new WangShi();

        hanFeiZhi.addObserver(liShi);
        hanFeiZhi.addObserver(zanShi);
        hanFeiZhi.addObserver(wangShi);

        hanFeiZhi.haveBreakfast();
        hanFeiZhi.notifyChange();
    }
}
