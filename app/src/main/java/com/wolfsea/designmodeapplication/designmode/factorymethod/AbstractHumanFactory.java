package com.wolfsea.designmodeapplication.designmode.factorymethod;

public abstract class AbstractHumanFactory {

    public abstract <T extends IHuman> T createHuman(Class<T> c);
}
