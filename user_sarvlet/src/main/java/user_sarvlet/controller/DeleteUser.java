package user_sarvlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user_sarvlet.dao.UserDao;
@WebServlet("/delete")
public class DeleteUser extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String value=req.getParameter("id");
		UserDao dao=new UserDao();
		System.out.println(value);
		
		//deleting
		dao.deleteUser(Integer.parseInt(value));
		req.setAttribute("user", dao.fetchAll());
		RequestDispatcher dispatcher=req.getRequestDispatcher("home.jsp");
		dispatcher.include(req, resp);
	}

}
