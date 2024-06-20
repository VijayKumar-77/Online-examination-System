package com.vijay.online_examination_system.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.online_examination_system.Repository.QuestionRepository;
import com.vijay.online_examination_system.model.Question;

@RestController
@CrossOrigin("*")
public class QuestionController {
   
	 @Autowired
	  private QuestionRepository questionRepository; 
	   
	   
	 //to show all question present in database
	 
	 @GetMapping("/question")
	 public List<Question> getAllQuestion(){
		 return (List<Question>) this.questionRepository.findAll(); 
	 }
	 
	
	 //add a question in a particular exam   
	 
	 @PostMapping("/question")
	 public ResponseEntity<String> addNewQuestion(@RequestBody Question question) {
	     Question savedQuestion = questionRepository.save(question);
	     String message = "Question added successfully with ID: " + savedQuestion.getId();
	     return ResponseEntity.status(HttpStatus.CREATED).body(message);
	 }
	 
	 
	 //to get details of all question of that particular exam   (using exam_id)  
	 
	 @GetMapping("/exam/question/{id}")
	 public ResponseEntity<Object> getQuestionById(@PathVariable("id") int id) {
	     Optional<Question> optionalQuestion = this.questionRepository.findById(id);
	     if (optionalQuestion.isPresent()) {
	         return ResponseEntity.ok(optionalQuestion.get());
	     } else {
	         return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Question not found for ID: " + id);
	     }
	 }
	 
	 //edit a question in a particular exam
	 
	 @PutMapping("/question/{id}")
	 public ResponseEntity<String> updateQuestion(@PathVariable("id") int id, @RequestBody Question question) {
	     Optional<Question> optionalQuestion = questionRepository.findById(id);
	     if (optionalQuestion.isPresent()) {
	         Question existingQuestion = optionalQuestion.get();
	         existingQuestion.setQname(question.getQname());
	         existingQuestion.setOptionOne(question.getOptionOne());
	         existingQuestion.setOptionTwo(question.getOptionTwo());
	         existingQuestion.setOptionThree(question.getOptionThree());
	         existingQuestion.setOptionFour(question.getOptionFour());
	         
	         Question updatedQuestion = questionRepository.save(existingQuestion);
	         return ResponseEntity.ok("Question with ID " + updatedQuestion.getId() + " updated successfully");
	     } else {
	         return ResponseEntity.notFound().build();
	     }
	 }
	 
	 
	 // delete a question in a particular exam
	 
	 @DeleteMapping("/question/{id}")
	 public ResponseEntity<String> deleteQuestion(@PathVariable("id") int id) {
	     this.questionRepository.deleteById(id);
	     String message = "Question with ID " + id + " deleted successfully";
	     return ResponseEntity.ok(message);
	 }
	 
	 
}
