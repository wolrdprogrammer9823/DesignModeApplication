package com.wolfsea.designmodeapplication.designmode.mediatormode3;

public abstract class Colleague {

    protected AbstractMediator mediator;

    public Colleague(AbstractMediator mediator) {

        this.mediator = mediator;
    }
}
