package com.example.demo.dal;

import com.example.demo.service.Employee;
import com.example.demo.service.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
class PostgresSqlRepository implements EmployeeRepository {
    @Autowired
    EmployeeRepo employeeRepo;
    @Override
    public Flux<Employee> allEmployees() {
        return employeeRepo.findAll().map(EntityConverter::EmployeeEntityToEmployee);
    }

    @Override
    public Mono<Employee> uniEmployee(int id) {
        return employeeRepo.findById(id).map(EntityConverter::EmployeeEntityToEmployee);
    }

    @Override
    public Mono<Employee> addEmployee(Employee employee) {
        return employeeRepo
                .save(EntityConverter.EmployeeToEmployeeEntity(employee))
                .map(EntityConverter::EmployeeEntityToEmployee);
    }

    @Override
    public Mono deleteEmployee(int id) {
        return employeeRepo.deleteById(id);
    }

    @Override
    public Mono<Employee> updateEmployee(Employee employee,int id) {
        return employeeRepo.findById(id)
                .map(emp -> {
            emp.setEmail(employee.getEmail());
            emp.setName(employee.getName());
            emp.setPhno(employee.getPhno());
            return emp;
        }).flatMap(emp -> employeeRepo.save(EntityConverter.EmployeeToEmployeeEntity(employee)).map(EntityConverter::EmployeeEntityToEmployee));
    }
}
