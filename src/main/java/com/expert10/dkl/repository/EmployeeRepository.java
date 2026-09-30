package com.expert10.dkl.repository;

import com.expert10.dkl.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
/* I made the research and I asked
so it is possible to implement some functions
without writing tem,
cuz Spring Boot automatically gives us them.
Such as:

save()

findAll()

findById()

deleteById()

count()

existsById()
 */



