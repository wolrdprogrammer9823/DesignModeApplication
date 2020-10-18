package com.wolfsea.designmodeapplication.designmode.responsibilitychainmode;

public class Husband extends Handler {

    @Override
    protected void handleRequest(IWoman woman) {

        System.out.println("丈夫准许请求:" + woman.getRequest());
    }
}
