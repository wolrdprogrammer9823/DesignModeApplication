package com.wolfsea.designmodeapplication.designmode.mediatormode2;

public class Purchase extends AbstractColleague {

    public Purchase(AbstractMediator abstractMediator) {

        super(abstractMediator);
    }

    public void buyIBMComputer(int number) {

        super.mediator.execute(Constants.PURCHASE, number);
    }

    public void refuseBuyIBMComputer() {

        System.out.println("不再采购IBM电脑");
    }
}
