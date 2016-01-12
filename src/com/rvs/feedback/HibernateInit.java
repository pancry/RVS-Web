package com.rvs.feedback;

import javax.servlet.http.HttpServlet;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateInit extends HttpServlet {

	public HibernateInit() {
		initHibernate();
	}

	private void initHibernate() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		// populates the data of the configuration file
		SessionFactory factory  = cfg.buildSessionFactory();

		DBUtil.getInstance().setFactory(factory);
	}

}
