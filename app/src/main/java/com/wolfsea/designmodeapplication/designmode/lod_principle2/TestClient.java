package com.wolfsea.designmodeapplication.designmode.lod_principle2;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/11/3  0:06
 **/
public class TestClient {

    public static void main(String[] args) {

        List<Girl> girlList = new ArrayList<>();

        final int GIRLS_SIZE = 20;

        for (int i = 0; i < GIRLS_SIZE; i++) {

            girlList.add(new Girl());
        }

        Teacher teacher = new Teacher();
        GroupLeader groupLeader = new GroupLeader(girlList);
        teacher.command(groupLeader);
    }
}
