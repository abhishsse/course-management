package com.in.att.qna.dto;

import com.in.att.qna.entity.QuestionContainer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class QuestionMainDTO {
	

	private QuestionContainer questionContainer;

	public QuestionContainer getQuestionContainer() {
		return questionContainer;
	}

	public void setQuestionContainer(QuestionContainer questionContainer) {
		this.questionContainer = questionContainer;
	}

}
