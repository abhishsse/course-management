package com.in.att.course.entity;

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
public class CoursePrizes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer coursePrizesId;
	private String CoursePrizeName;

}
