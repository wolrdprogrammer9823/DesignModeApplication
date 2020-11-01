package com.wolfsea.designmodeapplication.designmode.ii_principle2;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/11/2  0:06
 **/
public class TestClient {

    public static void main(String[] args) {

        IGoodBodyGirl goodBodyGirl = new PrettyGirl();
        AbstractSearcher searcher = new Searcher(goodBodyGirl);
        searcher.show();

        System.out.println("===================================");

        IGreatTemperamentGirl temperamentGirl = new PrettyGirl();
        searcher = new Searcher(temperamentGirl);
        searcher.show();
    }
}
