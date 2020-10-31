package com.wolfsea.designmodeapplication.designmode.interpretermode2;
import java.util.Stack;

/**
 * @author liuliheng
 * @desc 测试类
 * @time 2020/11/1  0:48
 **/
public class TestClient {

    public static void main(String[] args) {

        Context context = new Context();

        //通常定义容器,容纳具体的表达式.
        Stack<Expression> stack = null;

        for (;;) {
            //进行语法判断,产生递归调用.
        }

        //Expression expression = stack.pop();
        //具体元素入场
        //expression.interpreter(context);
    }
}
