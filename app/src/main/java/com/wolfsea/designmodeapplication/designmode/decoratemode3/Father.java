package com.wolfsea.designmodeapplication.designmode.decoratemode3;

public class Father {

    public static void main(String[] args) {

        SchoolReport schoolReport = new ForthGradeSchoolReport();
        schoolReport = new HighestScoreDecorator(schoolReport);
        schoolReport = new SortDecorator(schoolReport);
        schoolReport.report();
        schoolReport.sign("某某家长");

    }
}
