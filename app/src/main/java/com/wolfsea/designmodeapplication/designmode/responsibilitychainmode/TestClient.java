package com.wolfsea.designmodeapplication.designmode.responsibilitychainmode;

public class TestClient {

    public static void main(String[] args) {

        IWoman woman = new Woman(Constants.HUSBAND_HANDLE_REQUEST,"去逛街...");
        Father father = new Father();
        Husband husband = new Husband();
        Son son = new Son();

        int type = woman.getType();
        if (type == Constants.FATHER_HANDLE_REQUEST) {

             father.handleRequest(woman);
        } else if (type == Constants.HUSBAND_HANDLE_REQUEST) {

             husband.handleRequest(woman);
        } else if (type == Constants.SON_HANDLE_REQUEST) {

            son.handleRequest(woman);
        }
    }
}
