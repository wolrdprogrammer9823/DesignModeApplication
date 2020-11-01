package com.wolfsea.designmodeapplication.designmode.ii_principle;

/**
 * @author liuliheng
 * @desc 测试类
 * @time 2020/11/1  23:49
 **/
public class TestClient {

    public static void main(String[] args) {

        IPrettyGirl prettyGirl = new PrettyGirl();
        AbstractSearcher searcher = new Searcher(prettyGirl);
        searcher.show();
    }
}
