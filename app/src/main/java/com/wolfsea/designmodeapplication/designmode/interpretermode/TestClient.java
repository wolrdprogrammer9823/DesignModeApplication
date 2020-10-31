package com.wolfsea.designmodeapplication.designmode.interpretermode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/10/31  18:08
 **/
public class TestClient {

    public static void main(String[] args) throws IOException {

        String expStr = getExpression();
        HashMap<String, Integer> varStr = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        int result = calculator.run(varStr);
        System.out.println("result:" + result);
    }

    /**
     *@desc 获取表达式
     *@author:liuliheng
     *@time: 2020/10/31 18:09
    **/
    public static String getExpression() throws IOException {

        System.out.println("请输入表达式...");
        String inputStr = new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.println("inputStr=" + inputStr);
        return inputStr;
    }

    /**
     * @desc 获取值映射
     * @author:liuliheng
     * @time: 2020/10/31 18:12
     **/
    public static HashMap<String, Integer> getValue(String expStr) throws IOException {

        HashMap<String, Integer> valueMap = new HashMap<>();

        boolean notEmpty = expStr != null;
        if (notEmpty) {
            for (char ch : expStr.toCharArray()) {

                boolean condition = ch != '+' && ch != '-';
                if (condition) {

                    String calculateExpStr = new BufferedReader(new InputStreamReader(System.in)).readLine();

                    String actionExpStr = String.valueOf(ch);
                    boolean notContainsValue = !valueMap.containsKey(actionExpStr);
                    if (notContainsValue) {

                        valueMap.put(actionExpStr, Integer.parseInt(calculateExpStr));
                    }
                }
            }
        }

        return valueMap;
    }

}
