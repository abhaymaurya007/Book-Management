package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdminRegisterDAO {
	
	int  check=0;
	protected int  reg(AdminBean ab) {
		try {
		Connection con=DBConn.getConn();
			PreparedStatement ps1=con.prepareStatement("insert into AdminInfo values(?,?,?,?,?,?)");
			ps1.setString(1, ab.getName());
			ps1.setString(2, ab.getPass());
			ps1.setString(3, ab.getFName());
			ps1.setString(4, ab.getLName());
			ps1.setString(5, ab.getPass());
			ps1.setLong(6, ab.getPhno());
			check=ps1.executeUpdate();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return check;
		
	}

}
