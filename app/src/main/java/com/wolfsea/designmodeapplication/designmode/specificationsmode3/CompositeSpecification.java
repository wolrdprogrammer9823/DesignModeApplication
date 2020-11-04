package com.wolfsea.designmodeapplication.designmode.specificationsmode3;

/**
 * @author liuliheng
 * @desc 抽象组合规格
 * @time 2020/11/4  23:12
 **/
public abstract class CompositeSpecification implements IUserSpecification {

    public abstract boolean mIsSatisfiedUser(User user);

    @Override
    public IUserSpecification and(IUserSpecification specification) {

        return new AndSpecification(this, specification);
    }

    @Override
    public IUserSpecification or(IUserSpecification specification) {

        return new OrSpecification(this, specification);
    }

    @Override
    public IUserSpecification not(IUserSpecification specification) {

        return new NotSpecification(specification);
    }

}
