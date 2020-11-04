package com.wolfsea.designmodeapplication.designmode.specificationsmode3;

/**
 * @author liuliheng
 * @desc  用户规格接口
 * @time 2020/11/4  0:43
 **/
public interface IUserSpecification {

    boolean mIsSatisfiedUser(User user);

    IUserSpecification and(IUserSpecification specification);

    IUserSpecification or(IUserSpecification specification);

    IUserSpecification not(IUserSpecification specification);
}
