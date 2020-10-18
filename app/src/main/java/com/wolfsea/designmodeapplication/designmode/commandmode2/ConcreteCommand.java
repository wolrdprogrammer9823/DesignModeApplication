package com.wolfsea.designmodeapplication.designmode.commandmode2;

public class ConcreteCommand extends Command {

    public ConcreteCommand() {
        super(new ConcreteReceiver1());
    }

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    protected void execute() {
        receiver.doSomething1();
        receiver.doSomething2();
    }
}
