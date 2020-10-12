package com.wolfsea.designmodeapplication.designmode.buildermode4;

public class ConcreteBuilder extends Builder {

    private Product product = new Product();

    @Override
    public void setPart() {

        //执行产品内部逻辑
    }

    @Override
    public Product build() {

        return product;
    }
}
