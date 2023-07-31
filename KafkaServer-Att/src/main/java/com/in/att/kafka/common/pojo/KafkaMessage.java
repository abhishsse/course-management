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
public class KafkaMessage {
	
	private String id;
	private String message;
	private String topic;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public KafkaMessage(String id, String message) {
		super();
		this.id = id;
		this.message = message;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	@Override
	public String toString() {
		return "KafkaMessage [id=" + id + ", message=" + message + ", topic=" + topic + "]";
	}
	
	
}
