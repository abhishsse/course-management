package com.in.att.course.entity;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class CourseRating {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer courseRatingId;
	//private Map<String, Integer> courseRatingMap= new HashMap<String ,Integer>();
	
	

}
