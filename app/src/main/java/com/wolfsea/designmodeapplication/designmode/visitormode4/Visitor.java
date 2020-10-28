package com.wolfsea.designmodeapplication.designmode.visitormode4;

/**
 * @author liuliheng
 * @desc 访问者实现类
 * @time 2020/10/28  23:12
 **/
public class Visitor implements IVisitor {

    private int common_employee_total_salary = 0;
    private int manager_total_salary = 0;

    private static final int COMMON_EMPLOYEE_SALARY_FACTORY = 2;
    private static final int MANAGER_SALARY_FACTORY = 5;


    @Override
    public void visit(CommonEmployee commonEmployee) {
        getCommonEmployeeSalary(commonEmployee);
    }

    @Override
    public void visit(Manager manager) {
        getManagerSalary(manager);
    }

    @Override
    public int getTotalSalary() {
        return common_employee_total_salary + manager_total_salary;
    }

    private void getCommonEmployeeSalary(CommonEmployee commonEmployee) {
        common_employee_total_salary += commonEmployee.getSalary() * COMMON_EMPLOYEE_SALARY_FACTORY;
    }

    private void getManagerSalary(Manager manager) {
        manager_total_salary += manager.getSalary() * MANAGER_SALARY_FACTORY;
    }

//    private String getBasicInfo(Employee employee) {
//        return "name='" + employee.getName() + '\'' +
//                ", sex=" + (employee.getSex() == Employee.MALE ? "男性" : "女性") +
//                ", job='" + employee.getJob() + '\'';
//    }
//
//    private String getManagerInfo(Manager manager) {
//        return getBasicInfo(manager) + ",绩效考核为:" + manager.getPerformance();
//    }
//
//    private String getCommonEmployeeInfo(CommonEmployee commonEmployee) {
//        return getBasicInfo(commonEmployee) + ",薪水为:" + commonEmployee.getSalary();
//    }

}
