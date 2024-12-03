package com.hub.www.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hub.www.employee.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{	
}
