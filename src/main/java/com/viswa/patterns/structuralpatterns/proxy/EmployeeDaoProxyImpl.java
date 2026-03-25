package com.viswa.patterns.structuralpatterns.proxy;

public class EmployeeDaoProxyImpl implements EmployeeDao {
    private EmployeeDao empDaoObj;
    private String clientRole;

    public EmployeeDaoProxyImpl(String clientRole) {
        this.clientRole = clientRole;
        empDaoObj = new EmployeeDaoImpl();
    }

    @Override
    public void getEmployeeInfo(int empId) {
        if (clientRole.equalsIgnoreCase("ADMIN") || clientRole.equalsIgnoreCase("USER"))
            empDaoObj.getEmployeeInfo(empId);
        else
            throw new RuntimeException("Access Denied");
    }

    @Override
    public void createEmployee(EmployeeDo obj) {
        if (clientRole.equalsIgnoreCase("ADMIN"))
            empDaoObj.createEmployee(obj);
        else
            throw new RuntimeException("Access Denied");
    }
}
