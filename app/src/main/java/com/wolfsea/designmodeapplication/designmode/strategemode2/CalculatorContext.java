package com.wolfsea.designmodeapplication.designmode.strategemode2;

public class CalculatorContext {

    private ICalculator calculator;

    public CalculatorContext(ICalculator calculator) {
        this.calculator = calculator;
    }

    public int calculator(int a, int b) {
        return this.calculator.exec(a, b);
    }

    public void setCalculator(ICalculator calculator) {
        this.calculator = calculator;
    }
}
