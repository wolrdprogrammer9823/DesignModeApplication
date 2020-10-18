package com.wolfsea.designmodeapplication.designmode.commandmode1;

public class CodeGroup extends Group {

    @Override
    protected void find() {
        System.out.println("找到代码组...");
    }

    @Override
    protected void delete() {
        System.out.println("客户要求删除一个功能...");
    }

    @Override
    protected void change() {
        System.out.println("客户要求改变一个功能...");
    }

    @Override
    protected void plan() {
        System.out.println("客户要求变更代码计划...");
    }

    @Override
    protected void add() {
        System.out.println("客户要求增加一个功能...");
    }

    @Override
    protected void rollBack() {
        super.rollBack();
        delete();
    }
}
