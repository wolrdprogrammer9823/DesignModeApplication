package com.wolfsea.designmodeapplication.designmode.servantmode;

/**
 * @author liuliheng
 * @desc 衣服实体类
 * @time 2020/11/5  0:21
 **/
public class Cloth implements Cleanable {

    @Override
    public void cleaned() {

        System.out.println("衣服被清洗了...");
    }
}
