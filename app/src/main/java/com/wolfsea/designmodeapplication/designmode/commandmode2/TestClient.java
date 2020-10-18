package com.wolfsea.designmodeapplication.designmode.commandmode2;

public class TestClient {

    public static void main(String[] args) {

        //Receiver receiver = new ConcreteReceiver1();
        Receiver receiver = new ConcreteReceiver2();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.action();
    }
}
