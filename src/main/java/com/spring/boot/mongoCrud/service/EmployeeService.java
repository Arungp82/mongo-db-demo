package com.spring.boot.mongoCrud.service;

import com.spring.boot.mongoCrud.model.Employee;
import com.spring.boot.mongoCrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveOrUpdate(Employee emp){
        return employeeRepository.save(emp);
    }

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    public void delete (Employee employee){
        employeeRepository.delete(employee);
    }
}
