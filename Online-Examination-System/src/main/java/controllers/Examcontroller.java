package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.Exam;

public class Examcontroller {
	@RestController
	@RequestMapping("/api/exams")
	public class ExamController {

	    @Autowired
	    private ExamService examService;

	    @GetMapping("/{id}")
	    public ResponseEntity<Exam> getExamById(@PathVariable Long id) {
	        Exam exam = examService.getExamById(id);
	        return ResponseEntity.ok(exam);
	    }

	    @PostMapping("/create")
	    public ResponseEntity<Exam> createExam(@RequestBody Exam exam) {
	        Exam newExam = examService.createExam(exam);
	        return ResponseEntity.ok(newExam);
	    }

	}


}
