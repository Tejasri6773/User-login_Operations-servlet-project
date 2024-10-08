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
@WebServlet("/update")
public class Update extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String value=req.getParameter("id");
		UserDao dao=new UserDao();
		System.out.println(value);
		
		User db=dao.fetchById(Integer.parseInt(value));
		if(db!=null) {
			req.setAttribute("user", db);
			RequestDispatcher dispatcher=req.getRequestDispatcher("update.jsp");
			dispatcher.forward(req,resp);
		}
	}

}
