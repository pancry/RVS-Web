package com.rvs.feedback;

import org.hibernate.SessionFactory;

public class DBUtil {
	private SessionFactory factory;
	private static final DBUtil dbUtil = new DBUtil();
	
	private DBUtil(){
		
	}
	
	public static DBUtil getInstance(){
		return dbUtil;
	}
	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
}
