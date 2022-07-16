//package com.example.demo.service;
//
//import com.example.demo.dal.EmployeeEntity;
//import com.example.demo.dal.EmployeeRepo;
//import com.example.demo.dal.PostgresSqlRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mockito;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import reactor.core.publisher.Flux;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(SpringExtension.class)
//public class EmployeeServiceTest {
//    @InjectMocks
//    PostgresSqlRepository postgresSqlRepository;
//    @MockBean
//    EmployeeRepo employeeRepo;
//
//    @BeforeEach
//    void init(){
//    }
//    @Test
//    void listOfEmployeeTest(){
//        EmployeeEntity employee1 = new EmployeeEntity(1,"praveen", "praveen@Gmail.com",32151);
//        EmployeeEntity employee2 = new EmployeeEntity(2,"naveen", "praveen@Gmail.com",32151);
//        EmployeeEntity employee3 = new EmployeeEntity(3,"pravin", "praveen@Gmail.com",32151);
//        EmployeeEntity employee4 = new EmployeeEntity(4,"navin", "praveen@Gmail.com",32151);
//        EmployeeEntity employee5 = new EmployeeEntity(5,"shraveen", "praveen@Gmail.com",32151);
//
//        Flux<EmployeeEntity> employees = Flux.just(employee1,employee2,employee3,employee4,employee5);
//
//        assert(employees != null);
//
//
//        when(employeeRepo.findAll()).thenReturn(employees);
//
//        Flux<com.example.demo.service.Employee> employeeList = postgresSqlRepository.listOfEmployees();
//
//        assert(employeeList.last().equals(employee5));
//
//        Mockito.verify(employeeRepo).findAll();
//    }
//}
