package com.example.spring.basics.revision;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.spring.basics.CDI.CDIBusiness;
import com.example.spring.basics.scope.PersonClassDao;

@Configuration
@ComponentScan("com.example.spring.basics")
public class RevisionApplication2 {
	static Logger LOGGER = LoggerFactory.getLogger(RevisionApplication2.class);
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(RevisionApplication2.class);
		BinarySearchImpl bsi = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl bsi1 = applicationContext.getBean(BinarySearchImpl.class);
		PersonClassDao pc1 = applicationContext.getBean(PersonClassDao.class);
		PersonClassDao pc2 = applicationContext.getBean(PersonClassDao.class);
		CDIBusiness cb1 = applicationContext.getBean(CDIBusiness.class);
		CDIBusiness cb2 = applicationContext.getBean(CDIBusiness.class);
		
//		BinarySearchImpl bsi = new BinarySearchImpl(new QuickSortAlgorithm());
		bsi.sorting();
		LOGGER.warn(bsi.toString());
		LOGGER.warn(bsi1.toString());
		System.out.println(pc1);
		System.out.println(pc1.getXmlJdbcClassTemplate());
		System.out.println(pc2);
		System.out.println(pc2.getXmlJdbcClassTemplate());
		System.out.println(cb1);
		System.out.println(cb1.getcDIBusinessDao());
		System.out.println(cb2);
		System.out.println(cb2.getcDIBusinessDao());
		applicationContext.close();
	}
}
