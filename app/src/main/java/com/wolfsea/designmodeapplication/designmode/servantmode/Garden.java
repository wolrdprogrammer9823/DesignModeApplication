package com.wolfsea.designmodeapplication.designmode.servantmode;

/**
 * @author liuliheng
 * @desc  花园实体类
 * @time 2020/11/5  0:20
 **/
public class Garden implements Cleanable {

    @Override
    public void cleaned() {
        System.out.println("花园被修理了...");
    }
}
