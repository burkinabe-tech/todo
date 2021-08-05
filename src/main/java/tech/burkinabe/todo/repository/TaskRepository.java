package tech.burkinabe.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.burkinabe.todo.domain.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
