package com.rvs.feedback;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class FeedbackServlet extends HttpServlet {
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		String phone = (String) req.getParameter("phone");
		String mail = (String) req.getParameter("mail");
		String name = (String) req.getParameter("name");
		String message = (String) req.getParameter("message");
		
		
		SessionFactory factory = DBUtil.getInstance().getFactory();
				Session session = factory.openSession();

				// creating transaction object
				Transaction t = session.beginTransaction();

				Feedback feedback = new Feedback();
				feedback.setMessage(message);
				feedback.setMail(mail);
				feedback.setName(name);
				feedback.setPhone(phone);
				session.persist(feedback);

				t.commit();// transaction is committed
				session.close();

				
		String nextJSP = "/rvsoftwares/sendfeedback.html";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(req,resp);
	
	}
	
}