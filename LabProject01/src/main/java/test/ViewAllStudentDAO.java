package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewAllStudentDAO {
	
	public ArrayList<BookBean> al=new ArrayList<BookBean>();
	public ArrayList<BookBean> retrive(){
		try {
			Connection con=DBConn.getConn();
			PreparedStatement ps1=con.prepareStatement("select * from BookDetails01");
			ResultSet rs=ps1.executeQuery();
			while(rs.next()) {
				BookBean bb=new BookBean();
				bb.setBookID(rs.getInt(1));
				bb.setBookName(rs.getString(2));
				bb.setBookAuthor(rs.getString(3));
				bb.setBookPrice(rs.getFloat(4));
				bb.setBookqty(rs.getInt(5));
				al.add(bb);
				
				
			}
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return al;
	}

}
