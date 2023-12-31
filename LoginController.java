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


@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		DAOService service=new DAOServiceImpl();
		service.connectDb();
		boolean validate = service.validLogin(username, password);
		if (validate) {
			HttpSession session = request.getSession(true);
			session.setAttribute("username", username);
			session.setMaxInactiveInterval(60);
			request.setAttribute("msg", username);
			RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("error", username);
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		
	}

}
