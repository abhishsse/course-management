/**
 * 
 */
package com.in.att.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.att.user.domain.UserDomain;

/**
 * @author Abhi
 *
 */

//NOTE: Here Integer in the Type is the id feild uniquekey type
public interface UserRepository extends JpaRepository<UserDomain,Integer>{

}
