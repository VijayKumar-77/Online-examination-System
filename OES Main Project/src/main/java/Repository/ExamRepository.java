package Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Entity.Exam;

@Repository
public interface ExamRepository extends CrudRepository<Exam, Integer> {

}
