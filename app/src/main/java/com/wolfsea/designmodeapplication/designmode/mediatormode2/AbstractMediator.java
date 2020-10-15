package com.wolfsea.designmodeapplication.designmode.mediatormode2;

public abstract class AbstractMediator {

    protected Sale sale;
    protected Stock stock;
    protected Purchase purchase;

    public AbstractMediator() {

        sale = new Sale(this);
        stock = new Stock(this);
        purchase = new Purchase(this);
    }

    public abstract void execute(String type, Object... objects);
}
