package test;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;


@WebServlet("/viewBooks")
public class viewBooksServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession hs=request.getSession(false);
		if(hs!=null) {
			ArrayList<BookBean> blist=(ArrayList<BookBean>)(new ViewAllStudentDAO().retrive());
			hs.setAttribute("blist", blist);
			request.getRequestDispatcher("viewAllStudents.jsp").forward(request, response);
		}//end of if
	}

}
