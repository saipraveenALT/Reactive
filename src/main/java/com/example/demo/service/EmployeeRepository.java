package com.example.demo.service;

import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public interface EmployeeRepository {
    Flux<Employee> listOfEmployees();

    Mono<Employee> getEmployee(int id);

    Mono<Employee> addEmployee(Employee employee);

    Mono<Employee> deleteEmployeeById(int id);

    Mono<Employee> updateEmployee(Employee employee, int id);
}
