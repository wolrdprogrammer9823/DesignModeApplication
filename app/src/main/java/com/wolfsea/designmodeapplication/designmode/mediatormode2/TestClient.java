package com.wolfsea.designmodeapplication.designmode.mediatormode2;

public class TestClient {

    public static void main(String[] args) {

        AbstractMediator mediator = new Mediator();

        //采购进行采购电脑
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMComputer(100);

        System.out.println("=============================");

        //销售进行销售电脑
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(11);

        System.out.println("==============================");

        //库管管理库存
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
