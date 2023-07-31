/**
 * 
 */
package com.in.att.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.att.course.entity.Courses;

/**
 * @author Abhi
 *
 */
@Repository
public interface CoursesRepository extends JpaRepository<Courses, Integer> {

}
