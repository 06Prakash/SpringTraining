package com.example.spring.basics.CDI;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CDIBusiness {
	@Inject
	private CDIBusinessDao cDIBusinessDao;

	public CDIBusinessDao getcDIBusinessDao() {
		return cDIBusinessDao;
	}
}
