package com.example.spring.basics.revision;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

	@Autowired
	@Qualifier("Quick")
	private SortAlgorithm sortAlgorithm;


	public int sorting() {
		return sortAlgorithm.sort(new int[] { 1, 2, 3, 4 });
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Post Construct");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Pre Destroy");
	}
	
}
