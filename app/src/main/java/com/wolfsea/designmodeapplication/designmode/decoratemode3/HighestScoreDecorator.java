package com.wolfsea.designmodeapplication.designmode.decoratemode3;

public class HighestScoreDecorator extends SchoolReportDecorator {

    public HighestScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    @Override
    protected void report() {
        reportHighestScore();
        super.report();
    }

    @Override
    protected void sign(String name) {
        super.sign(name);
    }

    private void reportHighestScore() {

        System.out.println("最高分--->语文:90;数学:96;英语:88");
    }
}
