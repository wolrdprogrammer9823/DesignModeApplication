package com.wolfsea.designmodeapplication.designmode.ii_principle2;

/**
 * @author liuliheng
 * @desc 抽象类继承类
 * @time 2020/11/2  0:03
 **/
public class Searcher extends AbstractSearcher {

    public Searcher(IGoodBodyGirl goodBodyGirl) {
        super(goodBodyGirl);
    }

    public Searcher(IGreatTemperamentGirl greatTemperamentGirl) {
        super(greatTemperamentGirl);
    }

    public Searcher(IGoodBodyGirl goodBodyGirl, IGreatTemperamentGirl greatTemperamentGirl) {
        super(goodBodyGirl, greatTemperamentGirl);
    }

    @Override
    public void show() {

        if (getGoodBodyGirl() != null) {

            getGoodBodyGirl().goodLooking();
            getGoodBodyGirl().niceFigure();
        }

        if (getGreatTemperamentGirl() != null) {

            getGreatTemperamentGirl().greatTemperament();
        }
    }
}
