/**
 * 
 */
package com.in.att.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.att.course.entity.CoursePrizesClaims;

/**
 * @author Abhi
 *
 */
@Repository
public interface CoursePrizesClaimRepository extends JpaRepository<CoursePrizesClaims, Integer> {

}
