package com.wolfsea.designmodeapplication.designmode.decoratemode3;

public class SchoolReportDecorator extends SchoolReport {

    private SchoolReport schoolReport;

    public SchoolReportDecorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    @Override
    protected void report() {
        this.schoolReport.report();
    }

    @Override
    protected void sign(String name) {
        this.schoolReport.sign(name);
    }
}
