/**
 * 
 */
package com.in.att.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.att.course.entity.Courses;
import com.in.att.course.repository.CoursesRepository;

/**
 * @author Abhi
 *
 */

@RestController
@RequestMapping("/course")
public class CoursesController {

	@Autowired
	private  CoursesRepository courseRepository;
	
	@PostMapping("/save")
	public void saveCourse(@RequestBody Courses courses) {
		System.out.println(courses);
		courseRepository.save(courses);
	}
	

}
