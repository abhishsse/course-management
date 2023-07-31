package com.in.att.qna.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Table(name="ATT_QUESTION")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Q_ID")
	private Integer questId;
	private String questionDesc;
	private String questionType;
	private String questionCategory;
}
