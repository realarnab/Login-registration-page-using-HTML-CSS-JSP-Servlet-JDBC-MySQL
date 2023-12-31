package com.login_registration_project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login_registration_project.model.DAOService;
import com.login_registration_project.model.DAOServiceImpl;

@WebServlet("/register")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		  String username = request.getParameter("username");
		  String email = request.getParameter("email");
		  String password = request.getParameter("password");
		  DAOService service=new DAOServiceImpl();
		  service.connectDb();
		  int update = service.registerUser(username, email, password);
		
		  if (update!=0) {
			request.setAttribute("success", service);
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			rd.forward(request, response);
		  }else {
			request.setAttribute("error", service);
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			rd.forward(request, response);
		  }
	}

}
