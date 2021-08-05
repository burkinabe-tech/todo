package tech.burkinabe.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.burkinabe.todo.domain.EmployeeTask;

@Repository
public interface EmployeeTaskRepository extends JpaRepository<EmployeeTask, Long> {
}
