package com.wolfsea.designmodeapplication.designmode.strategemode3;

public class StrategyClient {

    public static void main(String[] args) {

        BackDoor backDoor = new BackDoor();
        StrategyContext strategyContext = new StrategyContext(backDoor);
        strategyContext.doOperate();

        GivenGreenLight givenGreenLight = new GivenGreenLight();
        strategyContext.setStrategy(givenGreenLight);
        strategyContext.doOperate();

        BlockEnemy blockEnemy = new BlockEnemy();
        strategyContext.setStrategy(blockEnemy);
        strategyContext.doOperate();
    }
}
