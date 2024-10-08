package user_sarvlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/register")
public class Register extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String fN=req.getParameter("Firstname");
		String lN=req.getParameter("lastName");
		String age=req.getParameter("age");
//		String ph=req.getParameter("phone");
		String email=req.getParameter("email");
		String Pwd=req.getParameter("passsword");
		
		
		int a=Integer.parseInt(age);
//		long p=Integer.parseInt(ph);
		int pw=Integer.parseInt(Pwd);
		
		
		PrintWriter writer=res.getWriter();
		writer.println("<html>"
				+"<body>"
				+"<h1 style=color:pink>"
				+"FirstName: "+fN+"\n"
				+"LastName :"+lN+"\n"
				+"age :"+a+"\n"
				+"email :"+email+"\n"
				+"Password :"+pw+"\n"
				+"</h1>"
				+"</body"
				+"</html>");
		
	}
	

}
