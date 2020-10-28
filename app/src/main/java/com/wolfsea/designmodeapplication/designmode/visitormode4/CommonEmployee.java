package com.wolfsea.designmodeapplication.designmode.visitormode4;

/**
 * @author liuliheng
 * @desc 普通雇员类
 * @time 2020/10/28  22:40
 **/
public class CommonEmployee extends Employee {

    private String others;

    @Override
    protected void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }
}
