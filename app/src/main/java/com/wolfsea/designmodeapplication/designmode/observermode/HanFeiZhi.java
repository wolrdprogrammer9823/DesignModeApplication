package com.wolfsea.designmodeapplication.designmode.observermode;

/**
 * @author liuliheng
 * @desc  实现类
 * @time 2020/10/25  10:17
 **/
public class HanFeiZhi implements IHanFeiZhi {

    private boolean isHavingBreakfast;
    private boolean isHavingFun;

    @Override
    public void haveBreakfast() {

        System.out.println("韩非子正在吃早饭...");
        this.isHavingBreakfast = true;
    }

    @Override
    public void haveFun() {

        System.out.println("韩非子正在娱乐...");
        this.isHavingFun = true;
    }

    public boolean isHavingBreakfast() {
        return isHavingBreakfast;
    }

    public void setHavingBreakfast(boolean havingBreakfast) {
        isHavingBreakfast = havingBreakfast;
    }

    public boolean isHavingFun() {
        return isHavingFun;
    }

    public void setHavingFun(boolean havingFun) {
        isHavingFun = havingFun;
    }
}
