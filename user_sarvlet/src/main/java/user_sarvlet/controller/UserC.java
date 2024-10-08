package user_sarvlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import user_sarvlet.dao.UserDao;
import user_sarvlet.dto.User;

@WebServlet("/reg")

public class UserC extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String fN=req.getParameter("fN");
		String lN=req.getParameter("lN");
		String email=req.getParameter("email");
		String pwd=req.getParameter("pwd");
		String phone=req.getParameter("phone");
		String age=req.getParameter("age");
		String gen=req.getParameter("gen");
		
		int age1=Integer.parseInt(age);
		long phn=Long.parseLong(phone);
		
		try {
			UserDao dao=new UserDao();
			User u=new User(fN, lN, email, pwd, phn, age1, gen);
			dao.saveUser(u);
			
//			dao.saveUser(new User(fN,lN,email,pwd,phn,age1,gen));
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
			dispatcher.forward(req, res);
		
		}
		catch(Exception e) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("register.jsp");
			dispatcher.include(req, res);
		}
		
	}
	

	
	
	

}
