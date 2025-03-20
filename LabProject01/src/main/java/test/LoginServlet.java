package test;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		AdminBean ab1=new AdminDAO().loginDao(req);
		if(ab1!=null) {
			HttpSession hs = req.getSession();
			req.setAttribute("msg", "Login Succesful");
			//req.setAttribute("ab", ab1);
			hs.setAttribute("ab", ab1);
		req.getRequestDispatcher("adminloginned.jsp").forward(req, res);;
		
		}
		else
		{
		req.setAttribute("msg", "login unsuccesfull.");	
		req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
	}

}
