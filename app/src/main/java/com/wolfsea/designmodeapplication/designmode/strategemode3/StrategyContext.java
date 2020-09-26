package com.wolfsea.designmodeapplication.designmode.strategemode3;

public class StrategyContext {

    private IStrategy strategy;

    public StrategyContext(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void doOperate() {
        this.strategy.operate();
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
