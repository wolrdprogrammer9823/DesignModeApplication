package com.wolfsea.designmodeapplication.designmode.visitormode5;

/**
 * @author liuliheng
 * @desc 汇总具体访问者
 * @time 2020/10/29  0:48
 **/
public class TotalVisitor implements ITotalVisitor {

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
}
