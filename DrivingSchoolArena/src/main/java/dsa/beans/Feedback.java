package dsa.beans;

public class Feedback {
	private String name,email,review,rating;
	private int srno;
	
	public  Feedback ( String name,String email,String review,String rating)
	{
		
		this.name=name;
		this.email=email;
		this.review=review;
		this.rating=rating;
		
	}

	public int getSrno() {
		return srno;
	}

	public void setSrno(int srno) {
		this.srno = srno;
	}

	public Feedback(String name, String email, String review, String rating, int srno) {
		super();
		this.name = name;
		this.email = email;
		this.review = review;
		this.rating = rating;
		this.srno = srno;
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

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
	

}
