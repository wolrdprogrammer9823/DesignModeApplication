package com.wolfsea.designmodeapplication.designmode.commandmode1;

public class ChangeCodeCommand extends Command {

    @Override
    protected void execute() {
        super.codeGroup.find();
        super.codeGroup.plan();
        super.codeGroup.change();
    }
}
