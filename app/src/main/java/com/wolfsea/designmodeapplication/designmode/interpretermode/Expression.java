package com.wolfsea.designmodeapplication.designmode.interpretermode;
import java.util.HashMap;

/**
 * @author liuliheng
 * @desc  抽象表达式类
 * @time 2020/10/31  17:46
 **/
public abstract class Expression {

    abstract int interpreter(HashMap<String, Integer> var);
}
