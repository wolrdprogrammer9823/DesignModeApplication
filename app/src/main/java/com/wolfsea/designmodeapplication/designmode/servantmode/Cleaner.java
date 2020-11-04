package com.wolfsea.designmodeapplication.designmode.servantmode;

/**
 * @author liuliheng
 * @desc  清洁工类
 * @time 2020/11/5  0:22
 **/
public class Cleaner {
    public void clean(Cleanable cleanable) {
        cleanable.cleaned();
    }
}
