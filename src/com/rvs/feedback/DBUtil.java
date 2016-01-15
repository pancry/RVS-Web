package com.rvs.feedback;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBUtil {
	private SessionFactory factory;
	private static final DBUtil dbUtil = new DBUtil();
	
	private DBUtil(){
		
	}
	
	public static DBUtil getInstance(){
		return dbUtil;
	}
	public SessionFactory getFactory() {
		if(factory == null){
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			factory  = cfg.buildSessionFactory();
		}
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
}
