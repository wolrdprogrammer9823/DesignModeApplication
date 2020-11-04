package com.wolfsea.designmodeapplication.designmode.specificationsmode4;

/**
 * @author liuliheng
 * @desc  抽象组合规格
 * @time 2020/11/4  23:50
 **/
public abstract class CompositeSpecification implements IObjectSpecification {

    public abstract boolean mIsSatisfied(Object object);

    @Override
    public IObjectSpecification and(IObjectSpecification specification) {
        return null;
    }

    @Override
    public IObjectSpecification or(IObjectSpecification specification) {
        return null;
    }

    @Override
    public IObjectSpecification not(IObjectSpecification specification) {
        return null;
    }
}
