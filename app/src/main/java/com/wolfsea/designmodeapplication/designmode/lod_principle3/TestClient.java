package com.wolfsea.designmodeapplication.designmode.lod_principle3;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/11/3  0:15
 **/
public class TestClient {

    public static void main(String[] args) {

        InstallWizard installWizard = new InstallWizard();
        Wizard wizard = new Wizard();
        installWizard.installWizard(wizard);

    }
}
