package com.wolfsea.designmodeapplication.designmode.commandmode;

public class RequirementGroup extends Group {
    @Override
    protected void find() {
        System.out.println("找到需求组...");
    }

    @Override
    protected void delete() {
        System.out.println("客户要求删除一个页面...");
    }

    @Override
    protected void change() {
        System.out.println("客户要求改变一个页面...");
    }

    @Override
    protected void plan() {
        System.out.println("客户要求变更需求计划...");
    }

    @Override
    protected void add() {
        System.out.println("客户要求增加一个页面...");
    }
}
