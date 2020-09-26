package com.wolfsea.designmodeapplication.designmode.factorymethod4;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonFactory {

    private static Singleton singleton;

    static {
        try {
            Class c = Class.forName(Singleton.class.getName());
            Constructor constructor = c.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton) constructor.newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                 | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static Singleton createInstance() {
        return singleton;
    }

}
