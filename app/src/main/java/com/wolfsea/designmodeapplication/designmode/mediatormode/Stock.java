package com.wolfsea.designmodeapplication.designmode.mediatormode;

public class Stock {

    private static int COMPUTER_NUMBER = 100;

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

        Sale sale = new Sale();
        Purchase purchase = new Purchase();

        purchase.refuseBuyIBMComputer();
        sale.offSale();

        System.out.println("清仓处理货物....");
    }

}
