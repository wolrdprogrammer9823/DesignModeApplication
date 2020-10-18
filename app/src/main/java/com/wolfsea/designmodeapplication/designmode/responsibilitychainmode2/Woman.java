package com.wolfsea.designmodeapplication.designmode.responsibilitychainmode2;

public class Woman implements IWoman {

    private int type;
    private String request;

    public Woman(int type, String request) {
        this.type = type;
        this.request = request;
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public String getRequest() {
        return request;
    }
}
