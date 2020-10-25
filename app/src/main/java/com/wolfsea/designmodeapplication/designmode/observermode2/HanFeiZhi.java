package com.wolfsea.designmodeapplication.designmode.observermode2;

/**
 * @author liuliheng
 * @desc  实现类
 * @time 2020/10/25  10:17
 **/
public class HanFeiZhi implements IHanFeiZhi {

    private ILiShi liShi = new LiShi();

    @Override
    public void haveBreakfast() {

        System.out.println("韩非子正在吃早饭...");
        liShi.update("吃早饭...");
    }

    @Override
    public void haveFun() {

        System.out.println("韩非子正在娱乐...");
        liShi.update("在娱乐...");
    }
}
