/**
 * 
 */
package com.in.att.qna.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.att.qna.entity.QuestionContainer;
import com.in.att.qna.repository.QuestionContainerRepository;
import com.in.att.qna.repository.QuestionRepository;
import com.in.att.qna.repository.QuestionSectionRepository;

/**
 * @author Abhi
 *
 */

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private  QuestionContainerRepository questionContainerRepository;

	
	@Autowired
	private QuestionSectionRepository questionSectionRepository;
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@PostMapping("/save")
	public void SaveQuestionnaire(@RequestBody QuestionContainer questionContainer) {
		System.out.println(questionContainer);
		questionContainerRepository.save(questionContainer);
	}
	
	@GetMapping("/find/all")
	public List<QuestionContainer> findAllContainer() {
		return questionContainerRepository.findAll();
		
	}

	@GetMapping("/find/{id}")
	public Optional<QuestionContainer> findQuestionContainerById(@PathVariable Integer id ) {	
		return questionContainerRepository.findById(id);
	}
}
