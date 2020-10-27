package com.wolfsea.designmodeapplication.designmode.mementomode5;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/10/27  22:36
 **/
public class TestClient {

    public static void main(String[] args) throws CloneNotSupportedException {

        //初始状态
        Originator originator = new Originator();
        originator.setState("哈哈哈哈哈哈哈......");
        System.out.println("初始状态是:" + originator.getState());

        //备份状态
        originator.createOriginator();

        //修改状态
        originator.setState("咿呀咿呀咿呀咿呀......");
        System.out.println("修改后的状态是:" + originator.getState());

        //还原状态
        originator.restoreOriginator();
        System.out.println("还原之后的状态:" + originator.getState());
    }
}
