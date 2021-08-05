package tech.burkinabe.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.burkinabe.todo.domain.EmployeeActivity;

@Repository
public interface EmployeeActivityRepository extends JpaRepository<EmployeeActivity, Long> {
}
