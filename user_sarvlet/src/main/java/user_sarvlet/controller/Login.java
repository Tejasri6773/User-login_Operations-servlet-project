package user_sarvlet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user_sarvlet.dao.UserDao;
import user_sarvlet.dto.User;

@WebServlet("/login")
public class Login extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		UserDao dao=new UserDao();
		
		try {
			String email=req.getParameter("mail");
			String pwd=req.getParameter("pwd");
			System.out.println(email);
			System.out.println(pwd);
			User us=dao.fetchUser(email);
			if(us.getPassword().equals(pwd)) {
				
				System.out.println("login success");
				req.setAttribute("user", us);
				
				req.setAttribute("user", dao.fetchAll());
				RequestDispatcher dispatcher=req.getRequestDispatcher("home.jsp");
				dispatcher.forward(req, resp);
			}
			else { 
				
				System.out.println("pwd is wrong");
				req.setAttribute("msg", "pwd is wrong");
				RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
				dispatcher.forward(req, resp);
				
			
			}
			
		}
		catch(Exception e) {
			System.out.println("email is wrong");
			req.setAttribute("msg", "email is wrong");
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
			dispatcher.forward(req, resp);
			
		}
		PrintWriter pw=resp.getWriter();
		pw.println(" regested successfully");
	

	}
	
	
	
	
	
	

}
