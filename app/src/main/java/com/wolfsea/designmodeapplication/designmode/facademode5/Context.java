package com.wolfsea.designmodeapplication.designmode.facademode5;

/**
 * @author liuliheng
 * @desc  封装业务逻辑类
 * @time 2020/10/25  21:17
 **/
public class Context {

    private ClassA classA = new ClassA();

    private ClassC classC = new ClassC();

    public void complexMethod() {

        classA.doSomethingA();
        classC.doSomethingC();
    }
}
