package test;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/register")
public class AdminRegister extends HttpServlet {
	
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminBean ab=new AdminBean();
		ab.setName(request.getParameter("username"));
		ab.setPass(request.getParameter("apass"));
		ab.setFName(request.getParameter("afname"));
        ab.setLName(request.getParameter("alname"));
        ab.setMailID(request.getParameter("amid"));
        ab.setPhno(Long.parseLong(request.getParameter("aphno")));
        int c=new AdminRegisterDAO().reg(ab);
        if(c>0)
        {
        	request.setAttribute("msg", "Registration succesfull.");	
    		request.getRequestDispatcher("RegisterSucces.jsp").forward(request, response);
        }
        else
        {
        	request.setAttribute("msg", "registration  unsuccesfull.");	
    		request.getRequestDispatcher("Msg.jsp").forward(request, response);
        }
	}

}
