package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	public static Connection con;
	
	private DBConn() {}
	
	static {
		try {
			Class.forName(DBInfo.classLoad);
			con = DriverManager.getConnection(DBInfo.url, DBInfo.name, DBInfo.pass);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static Connection getConn() {
		return con;
	}

}
