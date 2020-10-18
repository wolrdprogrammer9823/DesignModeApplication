package com.wolfsea.designmodeapplication.designmode.commandmode1;

public class DeletePageCommand extends Command {

    @Override
    protected void execute() {
        super.pageGroup.find();
        super.pageGroup.plan();
        super.pageGroup.delete();
    }
}
