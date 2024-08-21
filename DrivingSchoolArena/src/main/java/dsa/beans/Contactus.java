package dsa.beans;

import java.sql.Date;

public class Contactus {
	private int  serialno;
 public int getSerialno() {
		return serialno;
	}




	public void setSerialno(int serialno) {
		this.serialno = serialno;
	}




	public Date getDate() {
		return date;
	}




	public void setDate(Date date) {
		this.date = date;
	}




public Contactus(int serialno, String name, String email, String number, String query, Date date) {
		super();
		this.serialno = serialno;
		this.name = name;
		this.email = email;
		this.number = number;
		this.query = query;
		this.date = date;
	}

private String name,email,number,query;
 Date date;
 
 public Contactus(String name,String email,String number,String query)
 {
	 this.name=name;
	 this.email=email;
	 this.number=number;
	 this.query=query;
	 
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

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}

public String getQuery() {
	return query;
}

public void setQuery(String query) {
	this.query = query;
}
 
 

}
