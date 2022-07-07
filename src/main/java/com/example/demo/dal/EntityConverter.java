package com.example.demo.dal;

import com.example.demo.service.Employee;
import org.springframework.beans.BeanUtils;

class EntityConverter {
    public static EmployeeEntity EmployeeToEmployeeEntity(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties(employee,employeeEntity);
        return employeeEntity;
    }
    public static Employee EmployeeEntityToEmployee(EmployeeEntity employeeEntity){
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeEntity, employee);
        return employee;
    }
}
