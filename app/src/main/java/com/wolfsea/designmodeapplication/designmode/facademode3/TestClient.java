package com.wolfsea.designmodeapplication.designmode.facademode3;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/10/25  20:39
 **/
public class TestClient {

    public static void main(String[] args) {

        ModernPostOffice postOffice = new ModernPostOffice();
        String context = "家里一切安好...";
        String address = "西安";
        postOffice.sendLetter(context, address);
    }
}
