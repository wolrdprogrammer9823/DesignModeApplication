package com.wolfsea.designmodeapplication.designmode.specificationsmode2;

/**
 * @author liuliheng
 * @desc 年龄大于规格
 * @time 2020/11/4  0:46
 **/
public class UserAgeThanSpecification implements IUserSpecification {

    private int age;

    public UserAgeThanSpecification(int age) {
        this.age = age;
    }

    @Override
    public boolean mIsSatisfiedUser(User user) {

        return user.getAge() > age;
    }

}
