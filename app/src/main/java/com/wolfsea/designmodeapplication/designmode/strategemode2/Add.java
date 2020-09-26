package com.wolfsea.designmodeapplication.designmode.strategemode2;

public class Add implements ICalculator {

    @Override
    public int exec(int a, int b) {
        return a + b;
    }
}
