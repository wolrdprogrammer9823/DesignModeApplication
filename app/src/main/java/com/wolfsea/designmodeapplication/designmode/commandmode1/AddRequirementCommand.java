package com.wolfsea.designmodeapplication.designmode.commandmode1;

public class AddRequirementCommand extends Command {

    @Override
    protected void execute() {

        super.requirementGroup.find();
        super.requirementGroup.plan();
        super.requirementGroup.add();

        //增加页面
        super.pageGroup.add();
        //增加功能
        super.codeGroup.add();
    }
}
