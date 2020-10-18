package com.wolfsea.designmodeapplication.designmode.responsibilitychainmode2;

public class Son extends Handler {

    public Son() {
        super(Constants.SON_HANDLE_REQUEST);
    }

    @Override
    public void response(IWoman woman) {

        System.out.println("儿子准许请求:" + woman.getRequest());
    }
}
