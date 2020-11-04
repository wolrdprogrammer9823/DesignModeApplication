package com.wolfsea.designmodeapplication.designmode.servantmode;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/11/5  0:23
 **/
public class TestClient {

    public static void main(String[] args) {

        Cleaner cleaner = new Gardener();
        cleaner.clean(new Garden());

        System.out.println("==========================");

        cleaner = new Cooker();
        cleaner.clean(new Kitchen());

        System.out.println("==========================");

        cleaner = new Tailer();
        cleaner.clean(new Cloth());

    }
}
