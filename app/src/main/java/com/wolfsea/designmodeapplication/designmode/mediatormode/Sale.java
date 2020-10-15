package com.wolfsea.designmodeapplication.designmode.mediatormode;
import java.util.Random;

public class Sale {

    public void sellIBMComputer(int number) {

        Stock stock = new Stock();
        Purchase purchase = new Purchase();

        int stockNumber = stock.getStockNumber();
        if (stockNumber < number) {

            purchase.buyIBMComputer(number);
        }

        stock.decrease(number);
        System.out.println("卖出了:" + number + "台IBM电脑.");
    }

    public int getSaleStatus() {

        Random random = new Random(10);
        return random.nextInt() + 1;
    }

    public void offSale() {

        System.out.println("清空库存,卖出全部电脑.");
    }

}
