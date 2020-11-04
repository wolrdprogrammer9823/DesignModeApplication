package com.wolfsea.designmodeapplication.designmode.specificationsmode4;

/**
 * @author liuliheng
 * @desc 业务规格
 * @time 2020/11/4  23:55
 **/
public class BusinessSpecification extends CompositeSpecification {

    private final Object object;

    public BusinessSpecification(Object object) {
        this.object = object;
    }

    @Override
    public boolean mIsSatisfied(Object object) {
        //执行相关的业务逻辑
        return false;
    }
}
