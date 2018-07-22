package com.example.spring.basics.CDI;

import javax.inject.Inject;
import javax.inject.Named;

public class CDIBusiness {
	private CDIBusinessDao cDIBusinessDao;

	public CDIBusinessDao getcDIBusinessDao() {
		return cDIBusinessDao;
	}

	public void setcDIBusinessDao(CDIBusinessDao cDIBusinessDao) {
		this.cDIBusinessDao = cDIBusinessDao;
	}
}
