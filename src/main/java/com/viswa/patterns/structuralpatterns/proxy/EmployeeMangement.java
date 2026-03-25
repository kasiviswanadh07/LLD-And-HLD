package com.viswa.patterns.structuralpatterns.proxy;

public class EmployeeMangement {
    public static void main(String[] args) {
        EmployeeDao userProxyObj = new EmployeeDaoProxyImpl("USER");
        userProxyObj.getEmployeeInfo(5);
        userProxyObj.createEmployee(new EmployeeDo());
    }
}
