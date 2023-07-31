package com.in.att.qna.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="ATT_QUESTION_CONTAINER")
public class QuestionContainer{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer questContainerId;
	
	private String  questContainerName;
	
	@OneToMany(targetEntity = QuestionSection.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "QUES_CONT_ID_FK", referencedColumnName = "questContainerId")
	private List<QuestionSection> questionSectionList;
	
}
