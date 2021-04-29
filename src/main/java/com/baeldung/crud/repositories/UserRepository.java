package com.baeldung.crud.repositories;

import com.baeldung.crud.entities.Employee;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Employee, Long> {
    
    List<Employee> findByName(String name);
    
}
