package com.wolfsea.designmodeapplication.designmode.specificationsmode;

import java.util.ArrayList;

/**
 * @author liuliheng
 * @desc  用户提供者接口
 * @time 2020/11/4  0:14
 **/
public interface IUserProvider {

    ArrayList<User> findUserByNameEqual(String name);

    ArrayList<User> findUserByAgeThan(int age);
}
