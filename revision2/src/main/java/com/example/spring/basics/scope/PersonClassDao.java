package com.example.spring.basics.scope;

public class PersonClassDao {
	
	private XmlJdbcClassTemplate xmlJdbcClassTemplate;

	public XmlJdbcClassTemplate getXmlJdbcClassTemplate() {
		return xmlJdbcClassTemplate;
	}

	public void setXmlJdbcClassTemplate(XmlJdbcClassTemplate jdbcClassTemplate) {
		this.xmlJdbcClassTemplate = jdbcClassTemplate;
	}
	
	
}
