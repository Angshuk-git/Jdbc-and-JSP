package com.techpalle.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techpalle.jdbc.RegistrationService;


@WebServlet("/read")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String n=request.getParameter("tbname");
		String e=request.getParameter("tbemail");
		String q=request.getParameter("tbqual");
		String p=request.getParameter("tbpass");
		
		int affectedrows=RegistrationService.doRegister(n, e, q, p);
		if(affectedrows>0) {
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		else {
			response.getWriter().append("<h1 style=\"color:red\">data is not inserted</h1>");
			
		}
			
		

}
}
