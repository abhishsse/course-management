/**
 * 
 */
package com.in.att.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.att.course.entity.Courses;
import com.in.att.course.repository.CoursesRepository;

/**
 * @author Abhi
 *
 */

@Service
public class CoursesRepositoryService {
	
	@Autowired
	private CoursesRepository coursesRepository;
	
	
	public void saveQuestion(Courses courses) {
		
		coursesRepository.save(courses);
	}
	

}
