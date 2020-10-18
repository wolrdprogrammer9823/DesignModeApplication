package com.wolfsea.designmodeapplication.designmode.commandmode1;

public class RollbackDeletePageCommand extends Command {

    @Override
    protected void execute() {

        super.pageGroup.rollBack();
    }
}
