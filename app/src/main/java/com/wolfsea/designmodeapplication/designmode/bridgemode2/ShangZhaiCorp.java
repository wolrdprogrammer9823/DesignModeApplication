package com.wolfsea.designmodeapplication.designmode.bridgemode2;

/**
 * @author liuliheng
 * @desc 抽象公司实现类
 * @time 2020/11/1  22:56
 **/
public class ShangZhaiCorp extends Corp {

    public ShangZhaiCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("山寨公司赚大钱了...");
    }
}
