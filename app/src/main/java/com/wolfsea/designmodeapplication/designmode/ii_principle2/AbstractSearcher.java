package com.wolfsea.designmodeapplication.designmode.ii_principle2;

/**
 * @author liuliheng
 * @desc  抽象类
 * @time 2020/11/2  0:02
 **/
public abstract class AbstractSearcher {

    private IGoodBodyGirl goodBodyGirl;

    private IGreatTemperamentGirl greatTemperamentGirl;

    public AbstractSearcher(IGoodBodyGirl goodBodyGirl) {
        this.goodBodyGirl = goodBodyGirl;
    }

    public AbstractSearcher(IGreatTemperamentGirl greatTemperamentGirl) {
        this.greatTemperamentGirl = greatTemperamentGirl;
    }


    public AbstractSearcher(IGoodBodyGirl goodBodyGirl, IGreatTemperamentGirl greatTemperamentGirl) {
        this.goodBodyGirl = goodBodyGirl;
        this.greatTemperamentGirl = greatTemperamentGirl;
    }

    public IGoodBodyGirl getGoodBodyGirl() {
        return goodBodyGirl;
    }

    public IGreatTemperamentGirl getGreatTemperamentGirl() {
        return greatTemperamentGirl;
    }

    public abstract void show();
}
