package com.wolfsea.designmodeapplication.designmode.lod_principle2;

import java.util.List;

/**
 * @author liuliheng
 * @desc  实体类
 * @time 2020/11/3  0:04
 **/
public class GroupLeader {

    private List<Girl> girlList;

    public GroupLeader(List<Girl> girlList) {
        this.girlList = girlList;
    }

    public void countGirls() {

        System.out.println("女生的数量为:" + this.girlList.size());
    }
}
