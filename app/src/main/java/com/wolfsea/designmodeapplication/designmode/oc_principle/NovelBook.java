package com.wolfsea.designmodeapplication.designmode.oc_principle;

/**
 * @author liuliheng
 * @desc 小说类
 * @time 2020/11/3  0:35
 **/
public class NovelBook implements IBook {

    private String name;

    private int price;

    private String author;

    public NovelBook(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }
}
