package com.wolfsea.designmodeapplication.designmode.specificationsmode2;

import java.util.ArrayList;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/11/4  0:22
 **/
public class TestClient {

    public static void main(String[] args) {

        ArrayList<User> dataSource = dataSource();
        IUserProvider userProvider = new UserProvider(dataSource);

        String name = "tom";
        UserNameEqualSpecification userNameEqualSpecification = new UserNameEqualSpecification(name);
        ArrayList<User> targetUsers = userProvider.findTargetUser(userNameEqualSpecification);
        printUser(targetUsers);

        System.out.println("=================");

        int age = 35;
        UserAgeThanSpecification userAgeThanSpecification = new UserAgeThanSpecification(age);
        targetUsers = userProvider.findTargetUser(userAgeThanSpecification);
        printUser(targetUsers);

        System.out.println("=================");

        String likeTag = "%llo%";
        UserNameLikeSpecification userNameLikeSpecification = new UserNameLikeSpecification(likeTag);
        targetUsers = userProvider.findTargetUser(userNameLikeSpecification);
        printUser(targetUsers);
    }

    //数据源
    public static ArrayList<User> dataSource() {

        ArrayList<User> userArrayList = new ArrayList<>();

        User user1 = new User("tom", 30);
        User user2 = new User("tim", 20);
        User user3 = new User("tom", 50);
        User user4 = new User("tony", 34);
        User user5 = new User("jim", 33);
        User user6 = new User("dom", 26);
        User user7 = new User("sun", 41);
        User user8 = new User("tom", 61);
        User user9 = new User("hello", 41);
        User user10 = new User("llory", 21);
        User user11 = new User("ttllodd", 37);

        userArrayList.add(user1);
        userArrayList.add(user2);
        userArrayList.add(user3);
        userArrayList.add(user4);
        userArrayList.add(user5);
        userArrayList.add(user6);
        userArrayList.add(user7);
        userArrayList.add(user8);
        userArrayList.add(user9);
        userArrayList.add(user10);
        userArrayList.add(user11);

        return userArrayList;
    }

    public static void printUser(ArrayList<User> userArrayList) {
        for (User user : userArrayList) {
            System.out.println(user);
        }
    }
}
