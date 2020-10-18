package com.wolfsea.designmodeapplication.designmode.commandmode2;

public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    protected abstract void execute();
}
