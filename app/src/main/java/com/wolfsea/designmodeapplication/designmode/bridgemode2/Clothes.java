package com.wolfsea.designmodeapplication.designmode.bridgemode2;

/**
 * @author liuliheng
 * @desc 产品具体类
 * @time 2020/11/1  22:50
 **/
public class Clothes extends Product {

    @Override
    public void toBeProduced() {
        System.out.println("衣服被生产出来了...");
    }

    @Override
    public void toBeSell() {
        System.out.println("衣服被销售出去了...");
    }
}
