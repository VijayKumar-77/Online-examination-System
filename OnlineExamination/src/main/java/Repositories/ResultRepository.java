package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import Models.Result;

public interface ResultRepository extends JpaRepository<Result, Long> {
}
