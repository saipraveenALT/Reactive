package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public Flux<Employee> listOfEmployees() {
        return employeeRepository.listOfEmployees();
    }

    @Override
    public Mono<Employee> getEmployee(int id) {
        return employeeRepository.getEmployee(id);
    }

    @Override

    public Mono<Employee> addEmployee(Employee employee) {
        return employeeRepository.addEmployee(employee);
    }

    @Override
    public Mono deleteEmployeeById(int id) {
        return employeeRepository.deleteEmployeeById(id);
    }

    @Override
    public Mono<Employee> updateEmployee(Employee employee,int id) {
        return employeeRepository.updateEmployee(employee,id);
    }


}