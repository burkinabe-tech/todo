package tech.burkinabe.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.burkinabe.todo.domain.DepartmentProject;

@Repository
public interface DepartmentProjectRepository extends JpaRepository<DepartmentProject, Long> {
}
