/**
 * 
 */
package com.in.att.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.att.course.entity.CourseRating;
import com.in.att.course.entity.Courses;

/**
 * @author Abhi
 *
 */
@Repository
public interface CoursesRatingRepository extends JpaRepository<CourseRating, Integer> {

}
