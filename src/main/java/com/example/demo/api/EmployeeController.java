package com.example.demo.api;


import com.example.demo.service.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/hrms")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @GetMapping("/employees")
    public Flux<Employee> listEmployees(){
        return employeeService.allEmployees();
    }

    @GetMapping("/employees/{id}")
    public Mono<Employee> getEmployee(@PathVariable("id") int id){
        return employeeService.uniEmployee(id);
    }
    
    @PostMapping(value = "/employees")
    public Mono<Employee> addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @DeleteMapping("/employees/{id}")
    public Mono<Employee> deleteEmployeeById(@PathVariable("id") int id){
        return employeeService.deleteEmployee(id);
    }

    @PutMapping("/employees/{id}")
    public Mono<Employee> updateEmployee(@RequestBody Employee employee,@PathVariable("id") int id){
        return employeeService.updateEmployee(employee,id);
    }
}
