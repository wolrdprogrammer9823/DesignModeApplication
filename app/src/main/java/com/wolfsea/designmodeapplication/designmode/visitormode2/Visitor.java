package com.wolfsea.designmodeapplication.designmode.visitormode2;

/**
 * @author liuliheng
 * @desc 访问者实现类
 * @time 2020/10/28  23:12
 **/
public class Visitor implements IVisitor {

    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(getCommonEmployeeInfo(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(getManagerInfo(manager));
    }

    private String getBasicInfo(Employee employee) {
        return "name='" + employee.getName() + '\'' +
                ", sex=" + (employee.getSex() == Employee.MALE ? "男性" : "女性") +
                ", job='" + employee.getJob() + '\'';
    }

    private String getManagerInfo(Manager manager) {
        return getBasicInfo(manager) + ",绩效考核为:" + manager.getPerformance();
    }

    private String getCommonEmployeeInfo(CommonEmployee commonEmployee) {
        return getBasicInfo(commonEmployee) + ",薪水为:" + commonEmployee.getSalary();
    }
}
