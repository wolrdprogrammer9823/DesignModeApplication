package com.wolfsea.designmodeapplication.designmode.mediatormode2;

public class Mediator extends AbstractMediator {

    @Override
    public void execute(String type, Object... objects) {

        if (type.equals(Constants.PURCHASE)) {
            //采购
            this.buyIBMComputer((Integer) objects[0]);
        } else if (type.equals(Constants.SALE)) {
            //销售
            this.saleIBMComputer((Integer) objects[0]);
        } else if (type.equals(Constants.STOCK)) {
            //库存
            this.clearStock();
        } else if (type.equals(Constants.OFF_SALE)) {
            //折价出售
            this.offSale();
        } else if (type.equals(Constants.REFUSE_PURCHASE)) {
            System.out.println("不再购买IBM电脑....");
        }
    }

    private void buyIBMComputer(int number) {

        int saleStatus = super.sale.getSaleStatus();
        int actualNumber = number;

        if (saleStatus > 8) {

            System.out.println("销售状况良好,买进电脑.");
        } else {

            System.out.println("销售状况不怎么样,折半购买.");
            actualNumber = actualNumber / 2;
        }

        super.stock.increase(actualNumber);
    }

    private void saleIBMComputer(int number) {

        int stockNumber = super.stock.getStockNumber();
        if (stockNumber < number) {

            //库存不足,需要购买电脑.
            System.out.println("买进:" + number + "台电脑.");
            super.purchase.buyIBMComputer(number);
        }

        super.stock.decrease(number);
    }

    private void offSale() {
        System.out.println("折价销售IBM电脑:" + stock.getStockNumber() + "台");
    }

    private void clearStock() {

        System.out.println("进行清仓处理了...");
        super.purchase.refuseBuyIBMComputer();
        super.sale.offSale();
    }
}
