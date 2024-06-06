package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Models.Result;
import Repositories.ResultRepository;

@Service
public class ResultService {
    @Autowired
    private ResultRepository resultRepository;

    public List<Result> getAllResults() {
        return resultRepository.findAll();
    }

    public Result getResultById(Long id) {
        return resultRepository.findById(id).orElse(null);
    }

    public Result createResult(Result result) {
        return resultRepository.save(result);
    }

    public void deleteResult(Long id) {
        resultRepository.deleteById(id);
    }
}