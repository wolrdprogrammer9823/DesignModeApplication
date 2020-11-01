package com.wolfsea.designmodeapplication.designmode.bridgemode2;

/**
 * @author liuliheng
 * @desc 产品实现类
 * @time 2020/11/1  22:51
 **/
public class House extends Product {

    @Override
    public void toBeProduced() {

        System.out.println("房子被建造出来了...");
    }

    @Override
    public void toBeSell() {

        System.out.println("房子被销售出去了...");
    }
}
