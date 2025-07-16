package com.spring.boot.mongoCrud.repository;

import com.spring.boot.mongoCrud.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,Integer> {
}
