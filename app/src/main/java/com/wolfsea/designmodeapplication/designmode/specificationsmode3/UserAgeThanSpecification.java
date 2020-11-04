package com.wolfsea.designmodeapplication.designmode.specificationsmode3;

/**
 * @author liuliheng
 * @desc 年龄大于规格
 * @time 2020/11/4  0:46
 **/
public class UserAgeThanSpecification extends CompositeSpecification {

    private final int age;

    public UserAgeThanSpecification(int age) {
        this.age = age;
    }

    @Override
    public boolean mIsSatisfiedUser(User user) {
        return user.getAge() > age;
    }

}
