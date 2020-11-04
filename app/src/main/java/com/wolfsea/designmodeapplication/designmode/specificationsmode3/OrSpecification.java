package com.wolfsea.designmodeapplication.designmode.specificationsmode3;

/**
 * @author liuliheng
 * @desc 或规格
 * @time 2020/11/4  23:14
 **/
public class OrSpecification extends CompositeSpecification {

    private final IUserSpecification leftSpecification;
    private final IUserSpecification rightSpecification;

    public OrSpecification(IUserSpecification leftSpecification,
                           IUserSpecification rightSpecification) {
        this.leftSpecification = leftSpecification;
        this.rightSpecification = rightSpecification;
    }

    @Override
    public boolean mIsSatisfiedUser(User user) {

        return leftSpecification.mIsSatisfiedUser(user) || rightSpecification.mIsSatisfiedUser(user);
    }
}
