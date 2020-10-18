package com.wolfsea.designmodeapplication.designmode.responsibilitychainmode2;

public abstract class Handler {

    private int type;
    private Handler nextHandler;

    public Handler(int type) {
        this.type = type;
    }

    protected final void handleRequest(IWoman woman) {
        if (this.type == woman.getType()) {

            this.response(woman);
        } else {

            if (this.nextHandler != null) {

                this.nextHandler.handleRequest(woman);
            } else  {

                System.out.println("没有处理者了...");
            }
        }
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void response(IWoman woman);
}
