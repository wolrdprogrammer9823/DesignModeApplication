package com.wolfsea.designmodeapplication.designmode.mementomode2;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/10/26  23:59
 **/
public class TestClient {

    public static void main(String[] args) {

        Boy boy = new Boy();
        boy.setState("当前状态很棒...");
        System.out.println("=====男孩现在的状态=====");
        System.out.println(boy.getState());

        //需要记住当前的状态
        Memento memento = boy.createMemento();

        //状态改变
        boy.changeState();
        System.out.println("=====男孩追女孩后的状态=====");
        System.out.println(boy.getState());

        //恢复之前的状态
        boy.restoreMemento(memento);
        System.out.println("=====男孩恢复后的状态=====");
        System.out.println(boy.getState());
    }
}
