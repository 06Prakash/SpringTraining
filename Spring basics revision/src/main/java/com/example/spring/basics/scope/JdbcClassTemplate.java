package com.example.spring.basics.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbcClassTemplate {
	@PostConstruct
	public void postConstruct() {
		System.out.println("jdbc post construct");
	}

	
	@PreDestroy
	public void preDestroy() {
		System.out.println("jdbc pre construct");
	}

}
