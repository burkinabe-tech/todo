package tech.burkinabe.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.burkinabe.todo.domain.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
