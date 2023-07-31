/**
 * 
 */
package com.in.att.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.att.course.entity.CoursePrizes;

/**
 * @author Abhi
 *
 */
@Repository
public interface CoursePrizeRepository extends JpaRepository<CoursePrizes, Integer> {

}
