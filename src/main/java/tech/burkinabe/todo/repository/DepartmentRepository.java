package tech.burkinabe.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.burkinabe.todo.domain.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
