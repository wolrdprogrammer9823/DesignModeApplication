package com.wolfsea.designmodeapplication.designmode.specificationsmode3;

/**
 * @author liuliheng
 * @desc 名字相同
 * @time 2020/11/4  0:45
 **/
public class UserNameEqualSpecification extends CompositeSpecification {

    private final String name;

    public UserNameEqualSpecification(String name) {
        this.name = name;
    }

    @Override
    public boolean mIsSatisfiedUser(User user) {

        return user.getName().equals(name);
    }
}
