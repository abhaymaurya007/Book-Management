package test;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet("/logout")
public class logoutAdmin extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession hs=(HttpSession)request.getSession(false);
		if(hs!=null)
		{
	    //hs.removeAttribute("bb");
	    hs.invalidate();
	    //hs=null;
		}
	   request.setAttribute("msg", "u r logout");
	   request.getRequestDispatcher("logout.jsp").forward(request, response);
	}

}
