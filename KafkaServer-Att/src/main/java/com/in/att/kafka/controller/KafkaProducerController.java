/**
 * 
 */
package com.in.att.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

/**
 * @author Abhi
 *
 */

@Component
public class KafkaProducerController {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	@Value("${cloud.kafka.topic}")
	private String topic = "new_topic";

	public ListenableFuture sendMessage(String message) {

		ListenableFuture listenableFuture = kafkaTemplate.send(topic, message);
		if (listenableFuture != null) {
			return listenableFuture;
		}
		return listenableFuture;

	}
}
