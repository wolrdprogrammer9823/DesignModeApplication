package com.wolfsea.designmodeapplication.designmode.commandmode2;

public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
