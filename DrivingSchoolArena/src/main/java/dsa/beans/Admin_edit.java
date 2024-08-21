package dsa.beans;

public class Admin_edit {
	
	private String Userid,pass,number,email;

	

	public String getUserid() {
		return Userid;
	}



	public void setUserid(String userid) {
		Userid = userid;
	}



	public String getPass() {
		return pass;
	}



	public void setPass(String pass) {
		this.pass = pass;
	}



	public String getNumber() {
		return number;
	}



	public void setName(String number) {
		this.number= number;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Admin_edit(String userid, String pass, String name, String email) {
		super();
		Userid = userid;
		this.pass = pass;
		this.number = number;
		this.email = email;
	}

}
