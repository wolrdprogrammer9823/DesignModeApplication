package com.wolfsea.designmodeapplication.designmode.interpretermode;

/**
 * @author liuliheng
 * @desc  符号表达式
 * @time 2020/10/31  17:48
 **/
public abstract class SymbolExpression extends Expression {

    protected Expression leftExpression;
    protected Expression rightExpression;

    public SymbolExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }
}
