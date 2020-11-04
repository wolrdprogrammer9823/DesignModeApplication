package com.wolfsea.designmodeapplication.designmode.servantmode2;

/**
 * @author liuliheng
 * @desc  奴仆类
 * @time 2020/11/5  0:34
 **/
public class Servant {

    public void doService(IServiced serviced) {
        serviced.service();
    }
}
