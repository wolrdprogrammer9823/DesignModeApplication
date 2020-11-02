package com.wolfsea.designmodeapplication.designmode.oc_principle;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liuliheng
 * @desc  书店类
 * @time 2020/11/3  0:37
 **/
public class BookStore {

    private static final List<IBook> BOOK_LIST = new ArrayList<>();

    static {
        BOOK_LIST.add(new NovelBook("天龙八部", 100, "金庸"));
        BOOK_LIST.add(new NovelBook("巴黎圣母院", 80, "雨果"));
        BOOK_LIST.add(new NovelBook("朝花夕拾", 120, "鲁迅"));
        BOOK_LIST.add(new OffNovelBook("呐喊", 50, "鲁迅"));
        BOOK_LIST.add(new Computer("Thinking in Java", 150, "Tom Green", 1));
    }

    public static void main(String[] args) {

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        numberFormat.setMaximumFractionDigits(2);

        final int BOOK_AMOUNT = BOOK_LIST.size();
        for (int i = 0; i < BOOK_AMOUNT; i++) {

            IBook book = BOOK_LIST.get(i);
            System.out.println("书名:" + book.getName() + "---价格:" + numberFormat.format(book.getPrice()) + "---作者:" + book.getAuthor());
        }
    }
}
