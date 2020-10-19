package com.wolfsea.designmodeapplication.designmode.decoratemode2;

public class Father {

    public static void main(String[] args) {

        SchoolReport schoolReport = new SugarForthGradeSchoolReport();
        schoolReport.report();
        schoolReport.sign("某某家长");
    }
}
