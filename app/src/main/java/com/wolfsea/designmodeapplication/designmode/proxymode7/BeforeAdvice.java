package com.wolfsea.designmodeapplication.designmode.proxymode7;

public class BeforeAdvice implements IAdvice {
    @Override
    public void advice() {

        System.out.println("BeforeAdvice");
    }
}
