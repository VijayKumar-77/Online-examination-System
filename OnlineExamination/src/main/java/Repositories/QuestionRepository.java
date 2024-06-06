package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import Models.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
