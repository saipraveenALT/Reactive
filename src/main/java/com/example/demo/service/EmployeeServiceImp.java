package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Flux<Employee> allEmployees() {
        return employeeRepository.allEmployees();
    }

    @Override
    public Mono<Employee> uniEmployee(int id) {
        return employeeRepository.uniEmployee(id);
    }

    @Override
    public Mono<Employee> addEmployee(Employee employee) {
        return employeeRepository.addEmployee(employee);
    }

    @Override
    public Mono deleteEmployee(int id) {
        return employeeRepository.deleteEmployee(id);
    }

    @Override
    public Mono<Employee> updateEmployee(Employee employee,int id) {
        return employeeRepository.updateEmployee(employee,id);
    }


}