package tech.burkinabe.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.burkinabe.todo.domain.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long> {
}
