package com.wolfsea.designmodeapplication.designmode.bridgemode2;

/**
 * @author liuliheng
 * @desc  抽象公司类
 * @time 2020/11/1  22:52
 **/
public abstract class Corp {

    private Product product;

    public Corp(Product product) {
        this.product = product;
    }

    public void makeMoney() {
        this.product.toBeProduced();
        this.product.toBeSell();
    }
}
