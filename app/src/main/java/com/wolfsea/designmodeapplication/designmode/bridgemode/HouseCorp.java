package com.wolfsea.designmodeapplication.designmode.bridgemode;

/**
 * @author liuliheng
 * @desc 实现类
 * @time 2020/11/1  22:25
 **/
public class HouseCorp extends Corp {

    @Override
    public void produce() {
        System.out.println("房地产公司建造房子...");
    }

    @Override
    public void sell() {
        System.out.println("房地产公司销售房子...");
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了...");
    }
}
