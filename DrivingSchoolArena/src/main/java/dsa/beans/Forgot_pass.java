package dsa.beans;

public class Forgot_pass {
	
	String password,cpass;

	public Forgot_pass(String password, String cpass) {
		super();
		this.password = password;
		this.cpass = cpass;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCpass() {
		return cpass;
	}

	public void setCpass(String cpass) {
		this.cpass = cpass;
	}

	
	
	
}
