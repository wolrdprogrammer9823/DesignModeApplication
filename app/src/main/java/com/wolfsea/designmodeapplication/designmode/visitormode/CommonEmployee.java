package com.wolfsea.designmodeapplication.designmode.visitormode;

/**
 * @author liuliheng
 * @desc 普通雇员类
 * @time 2020/10/28  22:40
 **/
public class CommonEmployee extends Employee {

    @Override
    protected String getOtherInfo() {

        String otherInfo = "我是一个普通雇员";
        return otherInfo;
    }
}
