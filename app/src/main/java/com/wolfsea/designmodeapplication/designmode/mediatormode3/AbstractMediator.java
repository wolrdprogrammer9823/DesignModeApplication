package com.wolfsea.designmodeapplication.designmode.mediatormode3;

public abstract class AbstractMediator {

    protected ConcreteColleague1 concreteColleague1;

    protected ConcreteColleague2 concreteColleague2;

    public AbstractMediator() {

        this.concreteColleague1 = new ConcreteColleague1(this);
        this.concreteColleague2 = new ConcreteColleague2(this);
    }

    public abstract void doSomething1();

    public abstract void doSomething2();
}
