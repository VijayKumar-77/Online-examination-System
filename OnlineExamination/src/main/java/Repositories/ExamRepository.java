package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import Models.Exam;

public interface ExamRepository extends JpaRepository<Exam, Long> {
}
