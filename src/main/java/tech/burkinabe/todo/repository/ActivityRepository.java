package tech.burkinabe.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.burkinabe.todo.domain.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {
}
