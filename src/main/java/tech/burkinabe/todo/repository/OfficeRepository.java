package tech.burkinabe.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.burkinabe.todo.domain.Office;

@Repository
public interface OfficeRepository extends JpaRepository<Office, Long> {
}
