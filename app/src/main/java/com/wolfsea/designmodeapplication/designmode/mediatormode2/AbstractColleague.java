package com.wolfsea.designmodeapplication.designmode.mediatormode2;

public abstract class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator abstractMediator) {

        this.mediator = abstractMediator;
    }
}
