package com.wolfsea.designmodeapplication.designmode.bridgemode2;

/**
 * @author liuliheng
 * @desc 抽象产品类
 * @time 2020/11/1  22:48
 **/
public abstract class Product {

    //产品要被生产出来
    public abstract void toBeProduced();

    //产品要被卖出去
    public abstract void toBeSell();
}
