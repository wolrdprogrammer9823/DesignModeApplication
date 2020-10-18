package com.wolfsea.designmodeapplication.designmode.responsibilitychainmode2;

public class Father extends Handler {

    public Father() {
        super(Constants.FATHER_HANDLE_REQUEST);
    }

    @Override
    public void response(IWoman woman) {

        System.out.println("父亲准许请求:" + woman.getRequest());
    }
}
