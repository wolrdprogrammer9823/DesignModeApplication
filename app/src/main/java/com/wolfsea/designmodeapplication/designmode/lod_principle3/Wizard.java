package com.wolfsea.designmodeapplication.designmode.lod_principle3;

import java.util.Random;

/**
 * @author liuliheng
 * @desc 实体类
 * @time 2020/11/3  0:12
 **/
public class Wizard {

    private static final Random RANDOM = new Random();

    public int first() {

        System.out.println("执行第一步...");
        return RANDOM.nextInt(100);
    }

    public int second() {

        System.out.println("执行第二步...");
        return RANDOM.nextInt(50);
    }

    public int next() {

        System.out.println("执行第三步...");
        return RANDOM.nextInt(10);
    }
}
