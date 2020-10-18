package com.wolfsea.designmodeapplication.designmode.commandmode1;

public abstract class Group {

    protected abstract void find();

    protected abstract void delete();

    protected abstract void change();

    protected abstract void plan();

    protected abstract void add();

    //回滚操作
    protected  void rollBack() {

    }
}
