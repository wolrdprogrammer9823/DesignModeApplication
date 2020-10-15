package com.wolfsea.designmodeapplication.designmode.mediatormode3;

public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(AbstractMediator mediator) {

        super(mediator);
    }

    public void doSomething1() {

        super.mediator.doSomething1();
    }

    public void doSomething2() {

        super.mediator.doSomething2();
    }

}
