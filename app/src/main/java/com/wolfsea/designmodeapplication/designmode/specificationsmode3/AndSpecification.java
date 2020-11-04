package com.wolfsea.designmodeapplication.designmode.specificationsmode3;

/**
 * @author liuliheng
 * @desc 与规格
 * @time 2020/11/4  23:14
 **/
public class AndSpecification extends CompositeSpecification {

    private final IUserSpecification leftSpecification;
    private final IUserSpecification rightSpecification;

    public AndSpecification(IUserSpecification leftSpecification,
                            IUserSpecification rightSpecification) {
        this.leftSpecification = leftSpecification;
        this.rightSpecification = rightSpecification;
    }

    @Override
    public boolean mIsSatisfiedUser(User user) {

        return leftSpecification.mIsSatisfiedUser(user) && rightSpecification.mIsSatisfiedUser(user);
    }
}
