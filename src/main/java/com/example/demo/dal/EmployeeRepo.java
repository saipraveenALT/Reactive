package com.example.demo.dal;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EmployeeRepo extends ReactiveCrudRepository<EmployeeEntity,Integer> {

}
