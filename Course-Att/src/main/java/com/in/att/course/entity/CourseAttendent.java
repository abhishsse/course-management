package com.in.att.course.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class CourseAttendent {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer courseAttendentId;
	
	@ManyToMany
	@JoinColumn(name="COURSE_ATTENDENT_FK_ID", referencedColumnName="coursePrizeClaimId")
	private List<User> userList;
	
	

}
