package com.example.spring.basics.revision;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=RevisionApplication.class)
public class BinarySearchImplTest {

	@Autowired
	BinarySearchImpl bsi;	
	@Test
	public void sortTest() {
		assertEquals(3, bsi.sorting());
	}
}
