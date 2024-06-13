package Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Entity.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Integer> {
	
	public List<Question> findByEnameId(int id);

}
