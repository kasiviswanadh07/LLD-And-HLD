package com.viswa.patterns.structuralpatterns.proxy;

public interface EmployeeDao {
    void getEmployeeInfo(int empId);

    void createEmployee(EmployeeDo obj);
}
