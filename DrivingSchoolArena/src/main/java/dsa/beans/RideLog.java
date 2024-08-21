package dsa.beans;

public class RideLog {
	
	String trainerid, traineeid, source, destination, performance,
	deviceno, vechileno,date,duration;
	
	

	public RideLog(String trainerid, String traineeid, String source, String destination, String performance,
			String deviceno, String vechileno,String date,String duration) {
		super();
		this.trainerid = trainerid;
		this.traineeid = traineeid;
		this.source = source;
		this.destination = destination;
		this.performance = performance;
		this.deviceno = deviceno;
		this.vechileno = vechileno;
		this.date = date;
		this.duration = duration;
	}



	public RideLog() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getDuration() {
		return duration;
	}



	public void setDuration(String duration) {
		this.duration = duration;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getTrainerid() {
		return trainerid;
	}



	public void setTrainerid(String trainerid) {
		this.trainerid = trainerid;
	}



	public String getTraineeid() {
		return traineeid;
	}



	public void setTraineeid(String traineeid) {
		this.traineeid = traineeid;
	}



	public String getSource() {
		return source;
	}



	public void setSource(String source) {
		this.source = source;
	}



	public String getDestination() {
		return destination;
	}



	public void setDestination(String destination) {
		this.destination = destination;
	}



	public String getPerformance() {
		return performance;
	}



	public void setPerformance(String performance) {
		this.performance = performance;
	}



	public String getDeviceno() {
		return deviceno;
	}



	public void setDeviceno(String deviceno) {
		this.deviceno = deviceno;
	}



	public String getVechileno() {
		return vechileno;
	}



	public void setVechileno(String vechileno) {
		this.vechileno = vechileno;
	}

}
