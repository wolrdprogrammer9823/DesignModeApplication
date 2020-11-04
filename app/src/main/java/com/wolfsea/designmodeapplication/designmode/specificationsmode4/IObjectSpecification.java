package com.wolfsea.designmodeapplication.designmode.specificationsmode4;

/**
 * @author liuliheng
 * @desc  规格接口
 * @time 2020/11/4  23:49
 **/
public interface IObjectSpecification {

    boolean mIsSatisfied(Object object);

    IObjectSpecification and(IObjectSpecification specification);

    IObjectSpecification or(IObjectSpecification specification);

    IObjectSpecification not(IObjectSpecification specification);
}
