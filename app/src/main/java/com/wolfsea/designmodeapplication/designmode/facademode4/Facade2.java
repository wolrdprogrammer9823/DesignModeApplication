package com.wolfsea.designmodeapplication.designmode.facademode4;

/**
 * @author liuliheng
 * @desc 第二个门面
 * @time 2020/10/25  21:14
 **/
public class Facade2 {

    private Facade facade = new Facade();

    public void methodB() {

        facade.methodB();
    }

}
