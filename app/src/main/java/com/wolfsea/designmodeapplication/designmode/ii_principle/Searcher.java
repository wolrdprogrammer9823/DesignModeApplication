package com.wolfsea.designmodeapplication.designmode.ii_principle;

/**
 * @author liuliheng
 * @desc 抽象星探实现类
 * @time 2020/11/1  23:48
 **/
public class Searcher extends AbstractSearcher {

    public Searcher(IPrettyGirl prettyGirl) {
        super(prettyGirl);
    }

    @Override
    public void show() {

        super.prettyGirl.goodLooking();
        super.prettyGirl.niceFigure();
        super.prettyGirl.greatTemperament();
    }
}
