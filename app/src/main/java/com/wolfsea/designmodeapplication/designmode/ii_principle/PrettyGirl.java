package com.wolfsea.designmodeapplication.designmode.ii_principle;

/**
 * @author liuliheng
 * @desc 实现类
 * @time 2020/11/1  23:46
 **/
public class PrettyGirl implements IPrettyGirl {

    @Override
    public void goodLooking() {

        System.out.println("长的好看...");
    }

    @Override
    public void niceFigure() {

        System.out.println("身材好...");
    }

    @Override
    public void greatTemperament() {

        System.out.println("气质好...");
    }
}
