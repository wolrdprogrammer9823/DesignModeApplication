package com.wolfsea.designmodeapplication.designmode.mediatormode2;

public class Stock extends AbstractColleague {

    private static int COMPUTER_NUMBER = 100;

    public Stock(AbstractMediator abstractMediator) {

        super(abstractMediator);
    }

    public void increase(int number) {

        COMPUTER_NUMBER += number;
        System.out.println("当前库存量为:" + COMPUTER_NUMBER);
    }

    public void decrease(int number) {

        COMPUTER_NUMBER -= number;
        System.out.println("当前库存量为:" + COMPUTER_NUMBER);
    }

    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }

    public void clearStock() {
        super.mediator.execute(Constants.REFUSE_PURCHASE);
        super.mediator.execute(Constants.OFF_SALE);
        System.out.println("清仓处理货物....");
    }
}
