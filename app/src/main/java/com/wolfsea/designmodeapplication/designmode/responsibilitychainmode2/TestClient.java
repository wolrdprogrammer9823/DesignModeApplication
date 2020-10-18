package com.wolfsea.designmodeapplication.designmode.responsibilitychainmode2;

public class TestClient {

    public static void main(String[] args) {

        IWoman woman = new Woman(Constants.OTHER_HANDLE_REQUEST,"去逛街...");
        Father father = new Father();
        Husband husband = new Husband();
        Son son = new Son();

        father.setNextHandler(husband);
        husband.setNextHandler(son);
        father.handleRequest(woman);
    }
}
