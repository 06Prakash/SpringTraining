package com.example.spring.basics.revision;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.basics.CDI.CDIBusiness;
import com.example.spring.basics.scope.PersonClassDao;

public class XmlRevisionApplication {
	static Logger LOGGER = LoggerFactory.getLogger(XmlRevisionApplication.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
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
			System.out.println(applicationContext.getBeanDefinitionCount());
			LOGGER.info("Beans Loaded ==> {}", (Object)applicationContext.getBeanDefinitionNames());
			LOGGER.info("{} {}", pc1, pc1.getXmlJdbcClassTemplate());
			LOGGER.info("{} {}", pc2, pc2.getXmlJdbcClassTemplate());
			System.out.println(pc1);
			System.out.println(pc1.getXmlJdbcClassTemplate());
			System.out.println(pc2);
			System.out.println(pc2.getXmlJdbcClassTemplate());
			System.out.println(cb1);
			System.out.println(cb1.getcDIBusinessDao());
			System.out.println(cb2);
			System.out.println(cb2.getcDIBusinessDao());
		}
	}
}
