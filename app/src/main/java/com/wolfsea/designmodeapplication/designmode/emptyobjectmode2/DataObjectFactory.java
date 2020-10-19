package com.wolfsea.designmodeapplication.designmode.emptyobjectmode2;

public class DataObjectFactory {

    private volatile static DataObjectFactory instance;

    private DataObjectFactory() {}

    public static DataObjectFactory getInstance() {
        if (instance == null) {
            synchronized (DataObjectFactory.class) {
                if (instance == null) {
                    instance = new DataObjectFactory();
                }
            }
        }
        return instance;
    }

    public DataObject createDataObject(int value) {
        if (value < 0) {
            return new NullDataObject();
        }
        return new RealDataObject();
    }
}
