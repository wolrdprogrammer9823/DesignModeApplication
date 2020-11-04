package com.wolfsea.designmodeapplication.designmode.specificationsmode4;

/**
 * @author liuliheng
 * @desc 与规格
 * @time 2020/11/4  23:52
 **/
public class AndSpecification extends CompositeSpecification {

    private IObjectSpecification leftSpecification;
    private IObjectSpecification rightSpecification;

    public AndSpecification(IObjectSpecification leftSpecification,
                            IObjectSpecification rightSpecification) {
        this.leftSpecification = leftSpecification;
        this.rightSpecification = rightSpecification;
    }

    @Override
    public boolean mIsSatisfied(Object object) {

        return leftSpecification.mIsSatisfied(object) && rightSpecification.mIsSatisfied(object);
    }
}
