package com.wolfsea.designmodeapplication.designmode.facademode4;

/**
 * @author liuliheng
 * @desc  门面类
 * @time 2020/10/25  21:05
 **/
public class Facade {

    private ClassA classA = new ClassA();

    private ClassB classB = new ClassB();

    private ClassC classC = new ClassC();

    public void methodA() {
        classA.doSomethingA();
    }

    public void methodB() {
        classB.doSomethingB();
    }

    public void methodC() {
        classC.doSomethingC();
    }
}
