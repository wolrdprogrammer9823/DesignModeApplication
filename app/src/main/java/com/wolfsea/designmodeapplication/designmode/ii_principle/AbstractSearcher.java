package com.wolfsea.designmodeapplication.designmode.ii_principle;

/**
 * @author liuliheng
 * @desc  抽象星探
 * @time 2020/11/1  23:47
 **/
public abstract class AbstractSearcher {

    public IPrettyGirl prettyGirl;

    public AbstractSearcher(IPrettyGirl prettyGirl) {
        this.prettyGirl = prettyGirl;
    }

    public abstract void show();
}
