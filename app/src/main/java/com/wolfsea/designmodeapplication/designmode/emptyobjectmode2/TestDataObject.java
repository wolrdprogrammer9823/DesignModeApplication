package com.wolfsea.designmodeapplication.designmode.emptyobjectmode2;

public class TestDataObject {

    public static void main(String[] args) {

        DataObject dataObject = DataObjectFactory.getInstance().createDataObject(-1);
        dataObject.doSomething();
    }
}
