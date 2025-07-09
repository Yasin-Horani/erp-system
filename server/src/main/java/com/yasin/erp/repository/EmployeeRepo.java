package com.yasin.erp.repository;

import com.yasin.erp.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    Optional<Employee> findByEmployeeIdAndDeletedAtNull(long id);
}
