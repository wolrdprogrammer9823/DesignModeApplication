package com.wolfsea.designmodeapplication.designmode.strategemode3;

public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("亮绿灯...");
    }
}
