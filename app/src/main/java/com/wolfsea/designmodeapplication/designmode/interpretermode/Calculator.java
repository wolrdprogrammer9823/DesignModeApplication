package com.wolfsea.designmodeapplication.designmode.interpretermode;
import java.util.HashMap;
import java.util.Stack;

/**
 * @author liuliheng
 * @desc  计算器类
 * @time 2020/10/31  17:45
 **/
public class Calculator {

    private Expression expression;

    public Calculator(String expStr) {

        Stack<Expression> stack = new Stack<>();

        Expression left;
        Expression right;

        char[] chars = expStr.toCharArray();
        final int CHARS_LENGTH = chars.length;

        for (int i = 0; i < CHARS_LENGTH; i++) {
            switch (chars[i]) {
                case '+' :{

                    left = stack.pop();
                    String addExpStr = String.valueOf(chars[++i]);
                    right = new VarExpression(addExpStr);
                    AddExpression addExpression = new AddExpression(left, right);
                    stack.push(addExpression);
                    break;
                }
                case '-': {

                    left = stack.pop();
                    String subExpStr = String.valueOf(chars[++i]);
                    right = new VarExpression(subExpStr);
                    SubExpression addExpression = new SubExpression(left, right);
                    stack.push(addExpression);
                    break;
                }
                default: {

                    String varExpStr = String.valueOf(chars[i]);
                    VarExpression varExpression = new VarExpression(varExpStr);
                    stack.push(varExpression);
                    break;
                }
            }
        }

        this.expression = stack.pop();
    }

    /**
     *@desc 运行计算结构
     *@author:liuliheng
     *@time: 2020/10/31 18:06
    **/
    public int run(HashMap<String, Integer> var) {

        boolean expressionIsEmpty = this.expression == null;
        if (expressionIsEmpty) {
            throw new NullPointerException("要计算的表达式为空!!!");
        }
        return this.expression.interpreter(var);
    }
}
