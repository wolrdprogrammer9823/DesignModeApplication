package com.wolfsea.designmodeapplication.designmode.bridgemode;

/**
 * @author liuliheng
 * @desc 实现类
 * @time 2020/11/1  22:27
 **/
public class ClothesCorp extends Corp {

    @Override
    public void produce() {
        System.out.println("服装公司生产衣服...");
    }

    @Override
    public void sell() {
        System.out.println("服装公司销售服装...");
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装公司赚大钱了...");
    }
}
