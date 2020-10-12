package com.wolfsea.designmodeapplication.designmode.buildermode4;

public class Director {

    private Builder builder = new ConcreteBuilder();

    public Product buildProduct() {

        builder.setPart();
        return builder.build();
    }
}
