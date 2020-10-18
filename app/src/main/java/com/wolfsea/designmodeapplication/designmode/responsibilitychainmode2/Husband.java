package com.wolfsea.designmodeapplication.designmode.responsibilitychainmode2;

public class Husband extends Handler {

    public Husband() {
        super(Constants.HUSBAND_HANDLE_REQUEST);
    }

    @Override
    public void response(IWoman woman) {
        System.out.println("丈夫准许请求:" + woman.getRequest());
    }
}
