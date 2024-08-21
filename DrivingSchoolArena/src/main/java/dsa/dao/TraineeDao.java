package dsa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dsa.beans.Admission_Form;
import dsa.beans.RideLog;
import dsa.beans.Trainer_registration;
import dsa.dbutil.DBConnection;
import dsa.trainee.servlet.AdmissionForm;

public class TraineeDao {
 
           java.util.Date d1=new java.util.Date();
	
	java.sql.Date sd1=new java.sql.Date(d1.getTime());
	
	private Connection connection;
	public int admission_re(Admission_Form a) {
		
		connection=DBConnection.openConnection();
		
		String strinsert=" insert into tadmmisionrcv_form(name, email, address, age, program, gender, date, phoneno,status)value(?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement ps=null;
		int status=0;
		
		try {
			ps=connection.prepareStatement(strinsert);
			

			
			ps.setString(1,a. getName());
			ps.setString(2,a. getEmail());
			ps.setString(3,a. getAddress());
			ps.setInt(4,a. getAge());
			ps.setString(5,a. getProgram());
			ps.setString(6,a. getGender());
			ps.setDate(7,sd1);
			ps.setString(8,a. getPhoneno());
			ps.setString(9,"Not Confirm");
			
			
			status=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	public  Admission_Form viewProfile1(String ide1)
	{
		connection=DBConnection.openConnection();
		
		String strselect="select * from tadmmisionrcv_form where id=?";
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		 Admission_Form r=null;
		
		try {
			ps=connection.prepareStatement(strselect);
			ps.setString(1, ide1);
			rs=ps.executeQuery();
			
			if(rs.next())
			{
				String name=rs.getString("name");
				
				String email=rs.getString("email");
				String phone=rs.getString("phoneno");
				String gender=rs.getString("gender");
				String address=rs.getString("address");
				
				
				r=new Admission_Form();
				r.setName(name);
				r.setEmail(email);
				r.setPhoneno(phone);
				r.setGender(gender);
				r.setAddress(address);
				
				return r;
				 //<1> another method we can also use
				
				
				//<2>this is another method 
				/*
				 * r=new ; r.getName(name);
				 */
			
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	public boolean login(String id, String password) {
		
		connection=DBConnection.openConnection();
		
		String strselect="select * from tadmmisionrcv_form where id=? and password=?";
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			ps=connection.prepareStatement(strselect);
			ps.setString(1,id);
			ps.setString(2,password);
			rs=ps.executeQuery();
			if(rs.next())
			{
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public int editProfile(Admission_Form a, String id) {
		
		
		
connection=DBConnection.openConnection();
		
		String strinsert=" update tadmmisionrcv_form set name=?,email=?,phoneno=?,address=? where id=?";
		
		PreparedStatement ps=null;
		int status=0;
		
		try {
			ps=connection.prepareStatement(strinsert);
			

			
			ps.setString(1,a. getName());
			ps.setString(2,a. getEmail());
			ps.setString(3,a. getPhoneno());
			
			ps.setString(4,a. getAddress());
			
			
			ps.setString(5,id);
			
			
			status=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	
	public ArrayList<RideLog>viewPerformance(String id)
	{
		ArrayList<RideLog>list =new ArrayList<>();
		
		connection=DBConnection.openConnection();
		
		
		String strselect="select * from ride_log where trainee_id=?";
		PreparedStatement ps=null;
		ResultSet rs=null;
		RideLog r=null;
		
		try {
			ps=connection.prepareStatement(strselect);
			ps.setString(1,id);
			
			
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				String source=rs.getString("source");
				String destination=rs.getString("destination");
				String duration=rs.getString("duration");
				String performance=rs.getString("performance");
				String vehicle=rs.getString("vehicle");
				
				
				r=new RideLog();
				r.setSource(source);
				r.setDestination(destination);
				r.setDuration(duration);
				r.setPerformance(performance);
				r.setVechileno(vehicle);
				
				list.add(r);
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	
	
	
	
}
