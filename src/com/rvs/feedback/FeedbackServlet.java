package com.rvs.feedback;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FeedbackServlet extends HttpServlet {
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");// setting the content type
		String phone = (String) req.getParameter("phone");
		String mail = (String) req.getParameter("mail");
		String name = (String) req.getParameter("name");
		String message = (String) req.getParameter("message");
		
		
		String nextJSP = "/rvsoftwares/sendfeedback.html";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(req,resp);
	
	}
	
}