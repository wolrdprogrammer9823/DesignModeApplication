package com.wolfsea.designmodeapplication.designmode.specificationsmode4;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/11/4  23:56
 **/
public class TestClient {

    public static void main(String[] args) {

        //要分析的对象列表
        List<Object> objects = new ArrayList<>();

        //目标规格
        IObjectSpecification specification1 = new BusinessSpecification(new Object());
        IObjectSpecification specification2 = new BusinessSpecification(new Object());

        //获取目标对象
        for (Object object : objects) {

            if (specification1.and(specification2).mIsSatisfied(object)) {

                System.out.println(object);
            }
        }

    }

}
