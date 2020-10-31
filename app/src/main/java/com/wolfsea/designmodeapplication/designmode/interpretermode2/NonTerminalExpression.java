package com.wolfsea.designmodeapplication.designmode.interpretermode2;

/**
 * @author liuliheng
 * @desc 非终端表达式
 * @time 2020/11/1  0:47
 **/
public class NonTerminalExpression extends Expression {

    //每个非终端表达式都会对其他表达式产生依赖
    @Override
    public Object interpreter(Context context) {
        //进行文法处理
        return null;
    }
}
