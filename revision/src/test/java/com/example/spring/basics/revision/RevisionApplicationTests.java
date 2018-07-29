package com.example.spring.basics.revision;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=RevisionApplication.class)
public class RevisionApplicationTests {

	@Test
	public void sumTest() {
		int[] num = { 1, 2, 3, 4, 56 };
		System.out.println(new RevisionApplication().sum(num)); 
	}

}
