package com.wolfsea.designmodeapplication.designmode.decoratemode3;

public class ForthGradeSchoolReport extends SchoolReport {

    @Override
    protected void report() {

        System.out.println("个人成绩--->语文:70;数学:65;英语:66");
    }

    @Override
    protected void sign(String name) {

        System.out.println("家长签名:" + name);
    }
}
