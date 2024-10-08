package user_sarvlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user_sarvlet.dao.UserDao;
import user_sarvlet.dto.User;

@WebServlet("/edit")
public class Edit extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		String fN=req.getParameter("fN");
		String lN=req.getParameter("lN");
		String email=req.getParameter("email");
		String pwd=req.getParameter("pwd");
		String phone=req.getParameter("phone");
		String age=req.getParameter("age");
		String gen=req.getParameter("gen");
		
		int i_d=Integer.parseInt(id);
		int a=Integer.parseInt(age);
		long phn=Long.parseLong(phone);
		
		UserDao dao=new UserDao();
		User u=new User(i_d,fN,lN,email,pwd,phn,a,gen);
		dao.updateUser(u);
		req.setAttribute("user", dao.fetchAll());
		
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("home.jsp");
		dispatcher.include(req,resp);
	}

}
