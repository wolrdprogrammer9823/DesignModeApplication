package com.wolfsea.designmodeapplication.designmode.decoratemode2;

public class SugarForthGradeSchoolReport extends ForthGradeSchoolReport {

    private void reportHighestScore() {
        System.out.println("最高分:语文85;数学88;英语:90");
    }

    private void reportSort() {

        System.out.println("个人排名:40");
    }

    @Override
    protected void report() {
        reportHighestScore();
        super.report();
        reportSort();
    }
}


