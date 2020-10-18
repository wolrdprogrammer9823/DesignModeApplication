package com.wolfsea.designmodeapplication.designmode.responsibilitychainmode;

public class Son extends Handler {

    @Override
    protected void handleRequest(IWoman woman) {

        System.out.println("儿子准许请求:" + woman.getRequest());
    }
}
