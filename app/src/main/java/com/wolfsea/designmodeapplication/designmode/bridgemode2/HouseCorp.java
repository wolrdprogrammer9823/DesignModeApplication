package com.wolfsea.designmodeapplication.designmode.bridgemode2;

/**
 * @author liuliheng
 * @desc 抽象公司实现类
 * @time 2020/11/1  22:54
 **/
public class HouseCorp extends Corp {

    public HouseCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了...");
    }
}
