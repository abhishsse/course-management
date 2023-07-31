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
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="ATT_QUESTION_SECTION")
public class QuestionSection {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer questSectionId;
	
	private String questSectionName;
	
	@OneToMany(targetEntity = Question.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "QUES_SEC_ID_FK", referencedColumnName = "questSectionId")
	private  List<Question> questionList;
	
}
