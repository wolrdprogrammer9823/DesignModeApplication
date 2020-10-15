package com.wolfsea.designmodeapplication.designmode.mediatormode3;

public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(AbstractMediator mediator) {

        super(mediator);
    }

    public void doSomething1() {

       super.mediator.doSomething1();
    }

    public void doSomething2() {

        super.mediator.doSomething2();
    }
}
