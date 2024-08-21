package dsa.beans;

public class Trainer_registration {

	private String userid, password, name, email, phone, gender, experince, discription, address;

	public Trainer_registration() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Trainer_registration(String userid, String password, String name, String email, String phone, 
			String experince, String discription, String address) {
		super();
		this.userid = userid;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.experince = experince;
		this.discription = discription;
		this.address = address;
	}

	
	
	
	
	public Trainer_registration(String name, String email, String phone,  String experince,
			String discription, String address) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.experince = experince;
		this.discription = discription;
		this.address = address;
	}





	





	public Trainer_registration(String userid, String name) {
		super();
		this.userid = userid;
		this.name = name;
	}





	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	

	public String getExperince() {
		return experince;
	}

	public void setExperince(String experince) {
		this.experince = experince;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	
	
	
	
	
	
}
