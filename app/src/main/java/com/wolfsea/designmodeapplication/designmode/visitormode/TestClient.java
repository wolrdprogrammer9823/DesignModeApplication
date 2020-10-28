package com.wolfsea.designmodeapplication.designmode.visitormode;
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
        manager.setPerformance("销售额100万");
        employeeList.add(manager);

        Manager manager2 = new Manager();
        manager2.setJob("副总裁");
        manager2.setName("王代都");
        manager2.setSex(Employee.MALE);
        employeeList.add(manager2);
        manager2.setPerformance("招聘10个高级人才");

        Employee employee = new CommonEmployee();
        employee.setJob("程序员");
        employee.setName("刘不到");
        employee.setSex(Employee.MALE);
        employeeList.add(employee);

        Employee employee2 = new CommonEmployee();
        employee2.setJob("美工");
        employee2.setName("前二傻");
        employee2.setSex(Employee.FEMALE);
        employeeList.add(employee2);

        printEmployeeInfo(employeeList);
    }

    public static void printEmployeeInfo(List<Employee> employeeList) {

        for (Employee employee : employeeList) {

            employee.report();
        }
    }
}
