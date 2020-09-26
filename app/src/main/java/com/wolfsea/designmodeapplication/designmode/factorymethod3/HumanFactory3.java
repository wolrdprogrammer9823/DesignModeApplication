package com.wolfsea.designmodeapplication.designmode.factorymethod3;
import com.wolfsea.designmodeapplication.designmode.factorymethod.IHuman;

public class HumanFactory3 {
    public static <T extends IHuman> T createHuman(Class<T> c) {
        IHuman human = null;
        try {
            human = (T)Class.forName(c.getName()).newInstance();
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)human;
    }
}
