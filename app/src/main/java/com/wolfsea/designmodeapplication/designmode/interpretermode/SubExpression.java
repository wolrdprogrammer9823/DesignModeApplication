package com.wolfsea.designmodeapplication.designmode.interpretermode;

import java.util.HashMap;

/**
 * @author liuliheng
 * @desc 减号表达式
 * @time 2020/10/31  17:51
 **/
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    int interpreter(HashMap<String, Integer> var) {
        return super.leftExpression.interpreter(var) - super.rightExpression.interpreter(var);
    }
}
