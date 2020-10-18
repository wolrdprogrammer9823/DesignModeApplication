package com.wolfsea.designmodeapplication.designmode.commandmode1;

public abstract class Command {

    protected CodeGroup codeGroup = new CodeGroup();
    protected PageGroup pageGroup = new PageGroup();
    protected RequirementGroup requirementGroup = new RequirementGroup();

    protected abstract void execute();
}
