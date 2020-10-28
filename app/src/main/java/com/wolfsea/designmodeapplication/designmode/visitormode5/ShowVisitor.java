package com.wolfsea.designmodeapplication.designmode.visitormode5;

/**
 * @author liuliheng
 * @desc 具体展示访问者
 * @time 2020/10/29  0:53
 **/
public class ShowVisitor implements IShowVisitor {

    private String totalInfo = "";

    @Override
    public void report() {
        System.out.println(this.totalInfo);
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        this.totalInfo += getCommonEmployeeInfo(commonEmployee) + "\n";
    }

    @Override
    public void visit(Manager manager) {
        this.totalInfo += getManagerInfo(manager) + "\n";
    }

    private String getBasicInfo(Employee employee) {
        return "name='" + employee.getName() + '\'' +
                ", sex=" + (employee.getSex() == Employee.MALE ? "男性" : "女性") +
                ", job='" + employee.getJob() + '\'' +
                ", salary='" + employee.getSalary() + '\''
                ;
    }

    private String getManagerInfo(Manager manager) {
        return getBasicInfo(manager) + ",绩效考核为:" + manager.getPerformance();
    }

    private String getCommonEmployeeInfo(CommonEmployee commonEmployee) {
        return getBasicInfo(commonEmployee) + ",业余爱好为:" + commonEmployee.getOthers();
    }
}
