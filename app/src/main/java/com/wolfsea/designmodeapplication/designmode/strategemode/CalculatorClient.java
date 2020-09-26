package com.wolfsea.designmodeapplication.designmode.strategemode;

public class CalculatorClient {

    public static void main(String[] args) {

        int result = Calculator.ADD.exec(10, 6);
        System.out.println("result:" + result);

        int value = Calculator.SUB.exec(50, 10);
        System.out.println("value:" + value);

        int data = Calculator.MULTI.exec(5, 5);
        System.out.println("data:" + data);

        int div = Calculator.DIV.exec(10, 2);
        System.out.println("div:" + div);
    }
}
