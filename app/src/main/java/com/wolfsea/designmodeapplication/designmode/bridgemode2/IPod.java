package com.wolfsea.designmodeapplication.designmode.bridgemode2;

/**
 * @author liuliheng
 * @desc 抽象产品实现类
 * @time 2020/11/1  23:00
 **/
public class IPod extends Product {

    @Override
    public void toBeProduced() {
        System.out.println("IPod被生产出来了...");
    }

    @Override
    public void toBeSell() {
        System.out.println("IPod被销售出去了...");
    }
}
