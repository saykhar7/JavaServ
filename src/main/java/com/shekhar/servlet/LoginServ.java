package com.shekhar.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public LoginServ() {
        super();
        
    }


	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Data Passed into login page ");

		String email = (String) request.getParameter("email");
		String password = (String)request.getParameter("password");
		//doGet(request, response);
		
		System.out.print(email.equals(password));
		
	}

}
