package com.wolfsea.designmodeapplication.designmode.mediatormode;

public class TestMediatorClient {

    public static void main(String[] args) {

        //采购
        System.out.println("开始采购电脑了...");
        Purchase purchase = new Purchase();
        purchase.buyIBMComputer(100);

        System.out.println("====================");

        //销售
        System.out.println("销售电脑了...");
        Sale sale = new Sale();
        sale.sellIBMComputer(10);

        System.out.println("====================");

        //库存
        System.out.println("查看库存...");
        Stock stock = new Stock();
        stock.clearStock();
    }
}
