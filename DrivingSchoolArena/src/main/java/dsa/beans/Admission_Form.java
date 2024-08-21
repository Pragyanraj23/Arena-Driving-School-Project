package dsa.beans;

public class Admission_Form {

	
	private  Program p;
	private String name, email, address, program, gender,id, phoneno,password;
	private int age,admissionid;
	private int fees;
	
	
	
	
	public Admission_Form() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admission_Form(String name, String email, String address, String program, String gender, String phoneno,
			int age) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.program = program;
		this.gender = gender;
		this.phoneno = phoneno;
		this.age = age;
	}
	
	public Admission_Form(int admissionid,String name, String email, String address, String program, int age) {
		super();
		this.admissionid= admissionid;
		this.name = name;
		this.email = email;
		this.address = address;
		this.program = program;
		this.age = age;
		
		
	}

	
	
	

	public Admission_Form(int fees) {
		super();
		this.fees = fees;
	}

	

	public Admission_Form(String id, String password, int fees) {
		super();
		
		this.id=id;
		this.password = password;
		this.fees = fees;
	}

	/*
	 * public String getIde() { return ide; }
	 * 
	 * public void setIde(String ide) { this.ide = ide; }
	 */

	

	

	public Admission_Form(String name, String email, String program, String id, String phoneno, String password) {
		super();
		this.name = name;
		this.email = email;
		this.program = program;
		this.id = id;
		this.phoneno = phoneno;
		this.password = password;
	}

	

	public Admission_Form(String name, String email, String program, String id, String phoneno) {
		super();
		this.name = name;
		this.email = email;
		this.program = program;
		this.id = id;
		this.phoneno = phoneno;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public Program getP() {
		return p;
	}

	public void setP(Program p) {
		this.p = p;
	}

	public int getAdmissionid() {
		return admissionid;
	}

	public void setAdmissionid(int admissionid) {
		this.admissionid = admissionid;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	
	
	
}
