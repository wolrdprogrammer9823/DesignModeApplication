package com.wolfsea.designmodeapplication.designmode.strategemode2;

public class CalculatorClient {

    public static void main(String[] args) {

        ICalculator calculator = new Add();
        CalculatorContext calculatorContext = new CalculatorContext(calculator);
        int result = calculatorContext.calculator(6, 7);
        System.out.println("result:" + result);

        calculator = new Sub();
        calculatorContext.setCalculator(calculator);
        int value = calculatorContext.calculator(10, 2);
        System.out.println("value:" + value);

    }
}
