package com.in.att.course.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="ATT_COURSES")
@Setter
@Getter
public class Courses {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer courseId;
	private String courseName;
	private String courseType;
	private String courseCategory;
	private Integer numberOfTopics;
	private String numberOfPages;
	private Integer numberOfHours;
	private Integer pendingHours;
	
	@OneToMany
	@JoinColumn(name = "COURSE_RATING_ID_FK", referencedColumnName = "courseId")
	private List<CourseRating> courseRatingList;
	
	@ManyToMany
	@JoinColumn(name = "COURSE_ATTENDENT_ID_FK", referencedColumnName = "courseId")
	private List<CourseAttendent> courseAttendentList;
	
	@OneToMany
	@JoinColumn(name = "COURSE_PRIZES_ID_FK", referencedColumnName = "courseId")
	private List<CoursePrizes> coursePrizeList;
	
	@OneToMany
	@JoinColumn(name = "COURSE_PRIZES_CLAIMS_ID_FK", referencedColumnName = "courseId")
	private List<CoursePrizesClaims> coursePrizeClaimsList;
}
