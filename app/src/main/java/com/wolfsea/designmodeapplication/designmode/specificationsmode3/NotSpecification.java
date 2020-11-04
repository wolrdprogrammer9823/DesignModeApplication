package com.wolfsea.designmodeapplication.designmode.specificationsmode3;

/**
 * @author liuliheng
 * @desc 非规格
 * @time 2020/11/4  23:14
 **/
public class NotSpecification extends CompositeSpecification {

    private final IUserSpecification specification;

    public NotSpecification(IUserSpecification specification) {
        this.specification = specification;
    }

    @Override
    public boolean mIsSatisfiedUser(User user) {

        return !specification.mIsSatisfiedUser(user);
    }

}
