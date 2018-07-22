package com.example.spring.basics.revision;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.spring.basics.CDI.CDIBusiness;
import com.example.spring.basics.scope.PersonClassDao;

@SpringBootApplication
@ComponentScan("com.example.spring.basics")
public class RevisionApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(RevisionApplication.class, args);
		BinarySearchImpl bsi = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl bsi1 = applicationContext.getBean(BinarySearchImpl.class);
		PersonClassDao pc1 = applicationContext.getBean(PersonClassDao.class);
		PersonClassDao pc2 = applicationContext.getBean(PersonClassDao.class);
		CDIBusiness cb1 = applicationContext.getBean(CDIBusiness.class);
		CDIBusiness cb2 = applicationContext.getBean(CDIBusiness.class);
//		BinarySearchImpl bsi = new BinarySearchImpl(new QuickSortAlgorithm());
		bsi.sorting();
		System.out.println(bsi);
		System.out.println(bsi1);
		System.out.println(pc1);
		System.out.println(pc1.getJdbcClassTemplate());
		System.out.println(pc2);
		System.out.println(pc2.getJdbcClassTemplate());
		System.out.println(cb1);
		System.out.println(cb1.getcDIBusinessDao());
		System.out.println(cb2);
		System.out.println(cb2.getcDIBusinessDao());
	}
	
	public int sum(int[] num) {
		int tot = 0;
		for(int number: num) {
			tot += number;
		}
		return tot;
	}
}
