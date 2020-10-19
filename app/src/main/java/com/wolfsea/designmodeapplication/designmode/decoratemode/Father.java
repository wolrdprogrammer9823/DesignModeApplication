package com.wolfsea.designmodeapplication.designmode.decoratemode;

public class Father {

    public static void main(String[] args) {

        SchoolReport schoolReport = new ForthGradeSchoolGrade();
        schoolReport.report();
        schoolReport.sign("某某家长");
    }
}
