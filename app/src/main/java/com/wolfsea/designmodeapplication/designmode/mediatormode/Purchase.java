package com.wolfsea.designmodeapplication.designmode.mediatormode;

public class Purchase {

    public void buyIBMComputer(int number) {

        Stock stock = new Stock();
        Sale sale = new Sale();

        int saleNumber = sale.getSaleStatus();
        if (saleNumber > 8) {

            System.out.println("销售状况良好,增加进货量.");
            stock.increase(number);
        } else {

            stock.increase(number / 2);
            System.out.println("销售情况不佳,折半进货.");
        }
    }

    public void refuseBuyIBMComputer() {

        System.out.println("不再采购IBM电脑");
    }
}
