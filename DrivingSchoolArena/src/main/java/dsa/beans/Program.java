package dsa.beans;

public class Program {

	String pname,fees,discription;
	
	

	public String getPname() {
		return pname;
	}



	public void setPname(String pname) {
		this.pname = pname;
	}



	public String getFees() {
		return fees;
	}



	public void setFees(String fees) {
		this.fees = fees;
	}



	public String getDiscription() {
		return discription;
	}



	public void setDiscription(String discription) {
		this.discription = discription;
	}



	public Program() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Program(String pname, String fees, String discription) {
		super();
		this.pname = pname;
		this.fees = fees;
		this.discription = discription;
	}

	
	
}
