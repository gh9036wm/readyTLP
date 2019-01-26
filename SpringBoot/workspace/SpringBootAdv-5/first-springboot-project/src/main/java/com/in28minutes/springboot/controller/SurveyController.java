package com.in28minutes.springboot.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.in28minutes.springboot.service.SurveyService;
import com.in28minutes.springboot.model.Question;
@RestController
public class SurveyController {
	@Autowired
	private SurveyService surveyservice ;
	
	//GET
	@GetMapping("/surveys/{surveyId}/questions")
	public List<Question> retrieveQuestions(@PathVariable String surveyId) {
		return surveyservice.retrieveQuestions(surveyId);
	}
	
	@PostMapping("/surveys/{surveyId}/questions")
	public ResponseEntity<Void> addQuestionToSurvey(@PathVariable String surveyId,@RequestBody Question newQuestion) {
		
		Question question = surveyservice.addQuestion(surveyId, newQuestion);
// another steps to return status ( 201 created) code
		if (question == null)
		return ResponseEntity.noContent().build();

		// Success - URI of the new resource in Response Header
		// question.getQuestionId()
		// URI -> /surveys/{surveyId}/questions/{questionId}
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
				"/{id}").buildAndExpand(question.getId()).toUri();
		// Status - created
		return ResponseEntity.created(location).build();
	}
	//get specifice question from questions on each survey
	//"/surveys/{surveyId}/questions/{questionId}"
	@GetMapping ("/surveys/{surveyId}/questions/{questionId}")
	public Question retrieveDetailForQuestion(@PathVariable String surveyId,@PathVariable String questionId) {
		return surveyservice.retrieveQuestion(surveyId, questionId);
	}

}
