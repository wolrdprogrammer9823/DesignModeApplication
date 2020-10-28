package com.wolfsea.designmodeapplication.designmode.visitormode3;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/10/29  0:07
 **/
public class TestClient {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            Element element = ObjectStructure.createElement();
            element.accept(new Visitor());
        }
    }
}
