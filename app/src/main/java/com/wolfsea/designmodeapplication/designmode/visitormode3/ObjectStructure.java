package com.wolfsea.designmodeapplication.designmode.visitormode3;

import java.util.Random;

/**
 * @author liuliheng
 * @desc  数据结构
 * @time 2020/10/29  0:05
 **/
public class ObjectStructure {

    public static Element createElement() {

        Random random = new Random();
        int data = random.nextInt(100);
        boolean condition = data > 50;
        return condition ? new ConcreteElement1() : new ConcreteElement2();
    }
}
