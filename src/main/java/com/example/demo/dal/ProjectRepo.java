package com.example.demo.dal;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProjectRepo extends ReactiveCrudRepository<ProjectEntity, Long> {

}
