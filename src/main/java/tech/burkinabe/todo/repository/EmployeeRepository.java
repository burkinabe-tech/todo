package tech.burkinabe.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.burkinabe.todo.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
