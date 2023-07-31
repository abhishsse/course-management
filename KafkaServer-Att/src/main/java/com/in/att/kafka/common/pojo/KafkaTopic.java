/**
 * 
 */
package com.in.att.kafka.common.pojo;

import org.springframework.stereotype.Component;

/**
 * @author Abhi
 *
 */
@Component
public class KafkaTopic {
	private String id;
	private String topicName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	@Override
	public String toString() {
		return "KafkaTopic [id=" + id + ", topicName=" + topicName + "]";
	}
	

}
