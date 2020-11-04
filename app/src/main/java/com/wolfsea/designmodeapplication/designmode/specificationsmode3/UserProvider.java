package com.wolfsea.designmodeapplication.designmode.specificationsmode3;
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
    public ArrayList<User> findTargetUser(IUserSpecification userSpecification) {


        ArrayList<User> targetArrayList = new ArrayList<>();

        for (User user : userArrayList) {

            boolean mIsTargetUser = userSpecification.mIsSatisfiedUser(user);

            if (mIsTargetUser) {

                targetArrayList.add(user);
            }
        }

        return targetArrayList;

    }
}
