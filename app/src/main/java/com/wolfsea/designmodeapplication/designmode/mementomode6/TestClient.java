package com.wolfsea.designmodeapplication.designmode.mementomode6;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/10/27  23:28
 **/
public class TestClient {

    public static void main(String[] args) {

        //发起人
        Originator originator = new Originator();
        //管理者
        CareTaker careTaker = new CareTaker();

        //创建两个备忘录
        careTaker.setMemento("001", originator.createMemento());
        careTaker.setMemento("002", originator.createMemento());

        //恢复备忘录
        originator.restoreMemento(careTaker.getMemento("001"));
        originator.restoreMemento(careTaker.getMemento("002"));
    }
}
