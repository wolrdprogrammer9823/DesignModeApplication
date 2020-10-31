package com.wolfsea.designmodeapplication.designmode.interpretermode;
import java.util.HashMap;

/**
 * @author liuliheng
 * @desc 值表达式
 * @time 2020/10/31  17:47
 **/
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    int interpreter(HashMap<String, Integer> var) {

        boolean varIsEmpty = var == null || (this.key == null || this.key.length() == 0);
        if (varIsEmpty) {
            throw new NullPointerException("请传入不为空的值!!!");
        }

        Integer result = var.get(this.key);
        boolean resultIsEmpty = result == null;
        return resultIsEmpty ? 0 : result;
    }
}
