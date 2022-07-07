package com.example.demo.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface EmployeeService {
    Flux<Employee> allEmployees();

    Mono<Employee> uniEmployee(int id);

    Mono<Employee> addEmployee(Employee employee);

    Mono<Employee> deleteEmployee(int id);

    Mono<Employee> updateEmployee(Employee employee,int id);
}
