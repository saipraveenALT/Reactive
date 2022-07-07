package com.example.demo.dal;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
interface EmployeeRepo extends R2dbcRepository<EmployeeEntity,Integer> {

}
