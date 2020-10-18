package com.wolfsea.designmodeapplication.designmode.responsibilitychainmode;

public class Father extends Handler {

    @Override
    protected void handleRequest(IWoman woman) {

        System.out.println("父亲准许请求:" + woman.getRequest());
    }
}
