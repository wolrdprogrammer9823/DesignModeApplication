package com.wolfsea.designmodeapplication.designmode.specificationsmode4;

/**
 * @author liuliheng
 * @desc 与规格
 * @time 2020/11/4  23:52
 **/
public class NotSpecification extends CompositeSpecification {

    private final IObjectSpecification specification;

    public NotSpecification(IObjectSpecification specification) {
        this.specification = specification;
    }

    @Override
    public boolean mIsSatisfied(Object object) {

        return !specification.mIsSatisfied(object);
    }
}
