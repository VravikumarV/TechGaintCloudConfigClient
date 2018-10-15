package com.techgaint.cloudconfig.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TechGaintCloudConfigClient {

	@Value("${message:Hello Sorry, unable to connect git repo}")
	private String configProp;
	
	@RequestMapping("/cloudConfigRepo")
	public String getConfigProperty() {
		return configProp;
	}
	
}
