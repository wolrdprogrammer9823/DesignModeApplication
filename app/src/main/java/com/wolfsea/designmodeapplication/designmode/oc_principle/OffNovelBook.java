package com.wolfsea.designmodeapplication.designmode.oc_principle;

/**
 * @author liuliheng
 * @desc 实体类(降价小说)
 * @time 2020/11/3  0:44
 **/
public class OffNovelBook extends NovelBook {

    public OffNovelBook(String name, int price, String author) {
        super(name, price, author);
    }

    @Override
    public int getPrice() {

        int offPrice = super.getPrice();

        if (offPrice > 8000) {

            offPrice = offPrice * 80 / 100;
        } else {

            offPrice = offPrice * 90 / 100;
        }

        return offPrice;
    }
}
