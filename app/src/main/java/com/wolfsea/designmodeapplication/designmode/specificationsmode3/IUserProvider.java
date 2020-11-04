package com.wolfsea.designmodeapplication.designmode.specificationsmode3;
import java.util.ArrayList;

/**
 * @author liuliheng
 * @desc  用户提供者接口
 * @time 2020/11/4  0:14
 **/
public interface IUserProvider {

    ArrayList<User> findTargetUser(IUserSpecification userSpecification);
}
