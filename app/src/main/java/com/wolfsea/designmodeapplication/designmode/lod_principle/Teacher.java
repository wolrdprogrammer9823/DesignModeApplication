package com.wolfsea.designmodeapplication.designmode.lod_principle;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liuliheng
 * @desc  实体类
 * @time 2020/11/2  23:56
 **/
public class Teacher {

    public void command(GroupLeader groupLeader) {

        List<Girl> girlList = new ArrayList<>();

        final int GIRL_LIST_SIZE = 20;

        for (int i = 0; i < GIRL_LIST_SIZE; i++) {

            girlList.add(new Girl());
        }

        groupLeader.countGirls(girlList);

    }
}
