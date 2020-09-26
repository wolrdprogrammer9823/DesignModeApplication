package com.wolfsea.designmodeapplication.designmode.factorymethod;

public class HumanFactory extends AbstractHumanFactory {

    @Override
    public <T extends IHuman> T createHuman(Class<T> c) {
        IHuman human = null;
        try {
            human = (T)Class.forName(c.getName()).newInstance();
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}
