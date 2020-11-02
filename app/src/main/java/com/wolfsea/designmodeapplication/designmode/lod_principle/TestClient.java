package com.wolfsea.designmodeapplication.designmode.lod_principle;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/11/3  0:00
 **/
public class TestClient {

    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        teacher.command(new GroupLeader());
    }
}
