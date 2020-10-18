package com.wolfsea.designmodeapplication.designmode.commandmode1;

public class TestClient {

    public static void main(String[] args) {

        Invoker invoker = new Invoker();
        Command command = new ChangeCodeCommand();
        invoker.setCommand(command);
        invoker.action();

        System.out.println("============================");

        command = new DeletePageCommand();
        invoker.setCommand(command);
        invoker.action();

        System.out.println("============================");

        command = new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.action();
    }
}
