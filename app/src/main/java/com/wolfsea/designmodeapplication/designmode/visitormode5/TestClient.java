package com.wolfsea.designmodeapplication.designmode.visitormode5;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/10/28  22:45
 **/
public class TestClient {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        Manager manager = new Manager();
        manager.setJob("高级经理");
        manager.setName("王二小");
        manager.setSex(Employee.FEMALE);
        manager.setSalary(20000);
        manager.setPerformance("销售额100万");
        employeeList.add(manager);

        Manager manager2 = new Manager();
        manager2.setJob("副总裁");
        manager2.setName("王代都");
        manager2.setSex(Employee.MALE);
        manager2.setSalary(30000);
        employeeList.add(manager2);
        manager2.setPerformance("招聘10个高级人才");

        CommonEmployee employee = new CommonEmployee();
        employee.setJob("程序员");
        employee.setName("刘不到");
        employee.setSex(Employee.MALE);
        employee.setSalary(12000);
        employee.setOthers("书法");
        employeeList.add(employee);

        CommonEmployee employee2 = new CommonEmployee();
        employee2.setJob("美工");
        employee2.setName("前二傻");
        employee2.setSex(Employee.FEMALE);
        employee2.setSalary(10000);
        employee2.setOthers("象棋");
        employeeList.add(employee2);

        printEmployeeInfo(employeeList);
    }

    public static void printEmployeeInfo(List<Employee> employeeList) {

        IShowVisitor showVisitor = new ShowVisitor();
        ITotalVisitor totalVisitor = new TotalVisitor();

        for (Employee employee : employeeList) {

            employee.accept(showVisitor);
            employee.accept(totalVisitor);
        }

        showVisitor.report();
        System.out.println("totalSalary:" + totalVisitor.getTotalSalary());
    }
}
