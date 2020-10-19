package com.wolfsea.designmodeapplication.designmode.decoratemode;

public class ForthGradeSchoolGrade extends SchoolReport {

    @Override
    protected void report() {

        System.out.println("语文:90;数学:75;英语:86");
    }

    @Override
    protected void sign(String name) {

        System.out.println("家长签名:" + name);
    }
}
