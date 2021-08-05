package tech.burkinabe.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.burkinabe.todo.domain.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
