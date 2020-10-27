package com.wolfsea.designmodeapplication.designmode.mementomode7;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/10/27  23:49
 **/
public class TestClient {

    public static void main(String[] args) {

        Originator originator = new Originator();
        originator.setState("坚持、坚持、坚持...");
        System.out.println("初始状态:" + originator.getState());

        //备份状态
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(originator.createMemento());

        //修改状态
        originator.setState("加油、加油、加油...");
        System.out.println("修改后的状态:" + originator.getState());

        //复原状态
        originator.restoreMemento((Originator.Memento) careTaker.getMemento());
        System.out.println("恢复之后的状态:" + originator.getState());
    }
}
