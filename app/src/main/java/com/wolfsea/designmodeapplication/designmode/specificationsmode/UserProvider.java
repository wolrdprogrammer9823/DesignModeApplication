package com.wolfsea.designmodeapplication.designmode.specificationsmode;
import java.util.ArrayList;

/**
 * @author liuliheng
 * @desc 用户提供者实现类
 * @time 2020/11/4  0:17
 **/
public class UserProvider implements IUserProvider {

    private ArrayList<User> userArrayList;

    public UserProvider(ArrayList<User> userArrayList) {

        this.userArrayList = userArrayList;
    }

    @Override
    public ArrayList<User> findUserByNameEqual(String name) {

        ArrayList<User> targetArrayList = new ArrayList<>();

        for (User user : userArrayList) {

            boolean nameIsSame = user.getName().equals(name);

            if (nameIsSame) {

                targetArrayList.add(user);
            }
        }

        return targetArrayList;
    }

    @Override
    public ArrayList<User> findUserByAgeThan(int age) {

        ArrayList<User> targetArrayList = new ArrayList<>();

        for (User user : userArrayList) {

            boolean ageIsThan = user.getAge() > age;

            if (ageIsThan) {

                targetArrayList.add(user);
            }
        }

        return targetArrayList;
    }
}
