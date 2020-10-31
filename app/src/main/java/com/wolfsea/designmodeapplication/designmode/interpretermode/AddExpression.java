package com.wolfsea.designmodeapplication.designmode.interpretermode;
import java.util.HashMap;

/**
 * @author liuliheng
 * @desc 加号表达式
 * @time 2020/10/31  17:50
 **/
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    int interpreter(HashMap<String, Integer> var) {
        return super.leftExpression.interpreter(var) + super.rightExpression.interpreter(var);
    }
}
