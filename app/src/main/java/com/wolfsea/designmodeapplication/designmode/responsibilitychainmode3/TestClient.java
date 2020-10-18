package com.wolfsea.designmodeapplication.designmode.responsibilitychainmode3;

public class TestClient {

    public static void main(String[] args) {

        ConcreteHandler1 concreteHandler1 = new ConcreteHandler1();
        ConcreteHandler2 concreteHandler2 = new ConcreteHandler2();
        ConcreteHandler3 concreteHandler3 = new ConcreteHandler3();

        concreteHandler1.setNextHandler(concreteHandler2);
        concreteHandler1.setNextHandler(concreteHandler3);

        Request request = new Request();
        concreteHandler1.echo(request);
    }
}
