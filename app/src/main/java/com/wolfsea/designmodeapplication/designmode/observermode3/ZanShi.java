package com.wolfsea.designmodeapplication.designmode.observermode3;

/**
 * @author liuliheng
 * @desc 实现类
 * @time 2020/10/25  10:20
 **/
public class ZanShi implements Observer {

    @Override
    public void update(String content) {

        System.out.println("张斯:报告韩非子有活动了...");
        reportToHaShiHuang(content);
        System.out.println("张斯:汇报完毕...");
    }

    private void reportToHaShiHuang(String content) {

        System.out.println("张斯-->报告:韩非子的活动为:" + content);
    }
}
