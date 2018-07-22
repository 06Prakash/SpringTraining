package com.example.spring.basics.propertycheck;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyReaderRevision {

	@Value("${external.url.name}")
	private String url;

	public String getUrl() {
		return url;
	}

}
