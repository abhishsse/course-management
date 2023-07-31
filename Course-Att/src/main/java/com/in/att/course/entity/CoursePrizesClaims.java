package com.in.att.course.entity;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class CoursePrizesClaims {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer coursePrizeClaimId;
	
	private Integer totalPrizeClaimed;
	
	// Types of course prize map
	//private Map<String,Integer> coursePrizesClaimsMap= new HashMap<String , Integer>();
	
	@OneToMany
	@JoinColumn(name="COURSE_PRIZE_CLAIM_FK_ID", referencedColumnName="coursePrizeClaimId")
	private List<User> userList= new LinkedList<User>();
	

}
