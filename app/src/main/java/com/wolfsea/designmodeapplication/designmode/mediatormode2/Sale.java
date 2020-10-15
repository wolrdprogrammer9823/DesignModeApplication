package com.wolfsea.designmodeapplication.designmode.mediatormode2;
import java.util.Random;

public class Sale extends AbstractColleague {

    public Sale(AbstractMediator abstractMediator) {

        super(abstractMediator);
    }

    public void sellIBMComputer(int number) {

        super.mediator.execute(Constants.SALE, number);
    }

    public int getSaleStatus() {

        Random random = new Random(10);
        return random.nextInt() + 1;
    }

    public void offSale() {

        super.mediator.execute(Constants.OFF_SALE);
    }
}
