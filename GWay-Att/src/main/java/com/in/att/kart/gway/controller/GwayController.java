/**
 * 
 */
package com.in.att.kart.gway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Abhi
 *
 */
@RestController
@RefreshScope
public class GwayController {
	
	
	@Value("${test.property.value}")
	private String someProperties;
	
	
	public String strResp() {
		System.out.println("--- someProperties--- "+someProperties);
		return someProperties;
	}

}
