package com.wolfsea.designmodeapplication.designmode.mediatormode3;

public class TestClient {

    public static void main(String[] args) {

        AbstractMediator mediator = new ConcreteMediator();

        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(mediator);
        concreteColleague1.doSomething1();
        concreteColleague1.doSomething2();

        System.out.println("==========================================");

        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(mediator);
        concreteColleague2.doSomething1();
        concreteColleague2.doSomething2();
    }
}
