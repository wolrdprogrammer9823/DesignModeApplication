package com.wolfsea.designmodeapplication.designmode.specificationsmode;

/**
 * @author liuliheng
 * @desc  用户实体类
 * @time 2020/11/4  0:13
 **/
public class User {

    //名字
    private String name;

    //年龄
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
