package test;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AdminBean implements Serializable {
	private String Name;
	 private String Pass;
	 private String FName;
	 private String LName;
	 private String MailID;
	 private Long phno;
	public AdminBean() {
		
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public String getMailID() {
		return MailID;
	}
	public void setMailID(String mailID) {
		MailID = mailID;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	
 
}
