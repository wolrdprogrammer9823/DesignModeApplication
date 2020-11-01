package com.wolfsea.designmodeapplication.designmode.ii_principle2;

/**
 * @author liuliheng
 * @desc 接口实现类
 * @time 2020/11/2  0:00
 **/
public class PrettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl {

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
