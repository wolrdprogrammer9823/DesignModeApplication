package com.wolfsea.designmodeapplication.designmode.servantmode;

/**
 * @author liuliheng
 * @desc  厨房实体类
 * @time 2020/11/5  0:21
 **/
public class Kitchen implements Cleanable {

    @Override
    public void cleaned() {
        System.out.println("厨房被清洗了...");
    }
}
