package com.wolfsea.designmodeapplication.designmode.specificationsmode;

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

        ArrayList<User> targetUsers = userProvider.findUserByAgeThan(30);
        printUser(targetUsers);

        System.out.println("=================");

        String name = "tom";
        targetUsers = userProvider.findUserByNameEqual(name);
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

        userArrayList.add(user1);
        userArrayList.add(user2);
        userArrayList.add(user3);
        userArrayList.add(user4);
        userArrayList.add(user5);
        userArrayList.add(user6);
        userArrayList.add(user7);
        userArrayList.add(user8);

        return userArrayList;
    }

    public static void printUser(ArrayList<User> userArrayList) {
        for (User user : userArrayList) {
            System.out.println(user);
        }
    }
}
