package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public class BOOKDao {
	
    	public int addBook(HttpServletRequest req) {
    		HttpSession hs=req.getSession(false);
    		if(hs==null) 
    			return 0;
    	
    	Connection con=DBConn.getConn();
    	int k=0;
    	try {
    		
    		BookBean bb=(BookBean)hs.getAttribute("bb");
			PreparedStatement ps1=con.prepareStatement("insert into BookDetails01 values(?,?,?,?,?)");
			ps1.setInt(1,bb.getBookID());
			ps1.setString(2,bb.getBookName());
			ps1.setString(3,bb.getBookAuthor());
			ps1.setFloat(4,bb.getBookPrice());
			ps1.setInt(5,bb.getBookqty());
			 k=ps1.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    				return k;
    }
}
