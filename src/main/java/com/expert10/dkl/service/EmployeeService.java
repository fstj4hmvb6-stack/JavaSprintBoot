package com.expert10.dkl.service;

import com.expert10.dkl.entity.Employee;
import com.expert10.dkl.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service /* c est juste pour dire a Spring que ca contient la logique metier*/
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    // Create
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    // Read all
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    // Read by ID
    public Optional<Employee> getEmployeeById(Integer id) {
        return repository.findById(id);
    }

    // Update
    public Employee updateEmployee(Integer id, Employee newEmployee) {

        Employee employee = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        employee.setFirstName(newEmployee.getFirstName());
        employee.setLastName(newEmployee.getLastName());
        employee.setEmail(newEmployee.getEmail());
        employee.setPhoneNumber(newEmployee.getPhoneNumber());
        employee.setPosition(newEmployee.getPosition());
        employee.setDepartment(newEmployee.getDepartment());
        employee.setSalary(newEmployee.getSalary());

        return repository.save(employee);
    }

    // Delete
    public void deleteEmployee(Integer id) {
        repository.deleteById(id);
    }
}