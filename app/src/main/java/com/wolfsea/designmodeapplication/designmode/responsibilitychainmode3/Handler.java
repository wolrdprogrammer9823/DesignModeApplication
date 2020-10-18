package com.wolfsea.designmodeapplication.designmode.responsibilitychainmode3;

public abstract class Handler {

    private Handler nextHandler;

    public final Response handleRequest(Request request) {
        if (getRequestLevel() == request.getLevel()) {

           return this.echo(request);
        } else {
            if (this.nextHandler != null) {

                return this.nextHandler.echo(request);
            } else {

                return null;
            }
        }
    }

    public void setNextHandler(Handler nextHandler) {

        this.nextHandler = nextHandler;
    }

    public abstract Level getRequestLevel();

    public abstract Response echo(Request request);
}
