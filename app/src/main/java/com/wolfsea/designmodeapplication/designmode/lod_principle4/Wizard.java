package com.wolfsea.designmodeapplication.designmode.lod_principle4;

import java.util.Random;

/**
 * @author liuliheng
 * @desc 实体类
 * @time 2020/11/3  0:12
 **/
public class Wizard {

    private static final Random RANDOM = new Random();

    private int first() {

        System.out.println("执行第一步...");
        return RANDOM.nextInt(100);
    }

    private int second() {

        System.out.println("执行第二步...");
        return RANDOM.nextInt(50);
    }

    private int next() {

        System.out.println("执行第三步...");
        return RANDOM.nextInt(10);
    }

    public void install() {
        int first = this.first();

        if (first > 50) {

            int second = this.second();

            if (second > 10) {

                this.next();
            }
        }
    }
}
