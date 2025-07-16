package com.spring.boot.mongoCrud.controller;

import com.spring.boot.mongoCrud.model.Employee;
import com.spring.boot.mongoCrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<Employee>(employeeService.saveOrUpdate(employee), HttpStatus.ACCEPTED);
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return new ResponseEntity<List<Employee>>(employeeService.findAll(), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteEmployee(@RequestBody Employee employee){
        employeeService.delete(employee);
        return new ResponseEntity<String>("Employee deleted", HttpStatus.ACCEPTED);
    }

}
