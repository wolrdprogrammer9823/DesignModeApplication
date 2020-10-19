package com.wolfsea.designmodeapplication.designmode.decoratemode3;

public class SortDecorator extends SchoolReportDecorator {

    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    @Override
    protected void report() {
        super.report();
        reportSort();
    }

    @Override
    protected void sign(String name) {
        super.sign(name);
    }

    private void reportSort() {

        System.out.println("排名:36");
    }
}
