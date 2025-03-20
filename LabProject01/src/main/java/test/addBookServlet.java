package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/addBook")
public class addBookServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
	    BookBean bb=new BookBean();
	    bb.setBookID(Integer.parseInt( req.getParameter("bcode")));
	    bb.setBookName( req.getParameter("bname"));
	    bb.setBookAuthor( req.getParameter("bauthor"));
	    bb.setBookPrice( Float.parseFloat(req.getParameter("bprice")));
	    bb.setBookqty(Integer.parseInt( req.getParameter("bquantity")));
	    HttpSession hs=req.getSession(false);
	    hs.setAttribute("bb", bb);
		int k=new BOOKDao().addBook(req);
	if(k>0) {
		req.setAttribute("msg", "Book Added Suucesfully");
		hs.setAttribute("Bb", bb);
		req.getRequestDispatcher("bookaddsuccess.jsp").forward(req, res);
		
		
		
	}
	else
	{
		req.setAttribute("msg", "book not added");
		req.getRequestDispatcher("Msg.jsp");
	}
	}
	
}
