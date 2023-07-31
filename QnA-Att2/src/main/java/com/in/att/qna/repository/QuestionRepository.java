/**
 * 
 */
package com.in.att.qna.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.att.qna.entity.Question;

/**
 * @author Abhi
 *
 */
@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

}
