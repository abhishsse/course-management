/**
 * 
 */
package com.in.att.user.controller;

import java.util.HashMap;
import java.util.Map;

import javax.management.relation.RelationNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.in.att.user.domain.UserDomain;
import com.in.att.user.repository.impl.UserRepositoryImpl;

/**
 * @author Abhi
 *
 */

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepositoryImpl userRepositoryImpl;

	@PostMapping("/save")
	public void save(@RequestBody UserDomain userDomain) {
		userRepositoryImpl.saveUser(userDomain);
	}

	@GetMapping("/{id}")
	@ResponseBody
	public ResponseEntity<Map<Integer, UserDomain>> getUser(@PathVariable(value = "id") Integer userId)
			throws RelationNotFoundException {
		
		Map<Integer, UserDomain> map = new HashMap<>();
		map.put(1, new UserDomain(Integer.valueOf(userId), "a", "b", "c", 10));
		
		map.put(2, new UserDomain(Integer.valueOf(userId), "d", "e", "f", 30));
		System.out.println("userId -" + userId + "--" + map);
		
		return ResponseEntity.ok(map);
	}

}
