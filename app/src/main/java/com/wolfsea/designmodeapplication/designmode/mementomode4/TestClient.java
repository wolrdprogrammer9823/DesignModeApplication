package com.wolfsea.designmodeapplication.designmode.mementomode4;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/10/27  0:43
 **/
public class TestClient {

    public static void main(String[] args) {

        Originator originator = new Originator();
        originator.setState("明天是星期二了,哈哈哈哈...");

        //保存状态
        TakeCarer takeCarer = new TakeCarer();
        takeCarer.setMemento(originator.createMemento());

        //在此处可以改变状态
        originator.changeState();

        //恢复状态
        originator.restoreMemento(takeCarer.getMemento());
        originator.getState();
    }
}
