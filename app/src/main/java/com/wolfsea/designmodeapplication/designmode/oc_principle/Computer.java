package com.wolfsea.designmodeapplication.designmode.oc_principle;

/**
 * @author liuliheng
 * @desc 电脑实体类
 * @time 2020/11/3  0:51
 **/
public class Computer implements IComputerBook {

    private String name;
    private int price;
    private String author;
    private int scope;

    public Computer(String name, int price, String author,int scope) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.scope = scope;
    }

    @Override
    public int getScope() {
        return scope;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getAuthor() {
        return author;
    }
}
