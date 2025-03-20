package test;

import java.net.http.HttpRequest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.http.HttpServletRequest;

public class AdminDAO {

	AdminBean ab = null;

	public AdminBean loginDao(HttpServletRequest req) {
		try {
			Connection con = DBConn.getConn();
			String aname = req.getParameter("aname");
			String apass = req.getParameter("apass");
			System.out.println(aname+"   "+apass);
			PreparedStatement ps1 = con.prepareStatement("select * from AdminInfo where username=? and pass=?");
			ps1.setString(1, aname);
			ps1.setString(2, apass);
			ResultSet rs1 = ps1.executeQuery();
			if (rs1.next()) {
				ab = new AdminBean();
				ab.setName(aname);
				ab.setPass(apass);
				ab.setFName(rs1.getString(3));
				ab.setLName(rs1.getString(4));
				ab.setMailID(rs1.getString(5));
				ab.setPhno(rs1.getLong(6));
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
        System.out.println(ab);
		return ab;
	}
}
