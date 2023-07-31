/**
 * 
 */
package com.in.att.qna.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.att.qna.entity.QuestionContainer;
import com.in.att.qna.repository.QuestionContainerRepository;

/**
 * @author Abhi
 *
 */

@Service
public class QuestionRepositoryService {
	
	@Autowired
	private QuestionContainerRepository questionContainerRepository;
	
	
	public void saveQuestion(QuestionContainer questionContainer) {
		
		questionContainerRepository.save(questionContainer);
	}
	

}
