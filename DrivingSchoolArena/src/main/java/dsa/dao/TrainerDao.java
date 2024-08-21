package dsa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dsa.beans.Admission_Form;
import dsa.beans.Forgot_pass;
import dsa.beans.Program;
import dsa.beans.RideLog;
import dsa.beans.Trainer_registration;
import dsa.dbutil.DBConnection;

public class TrainerDao {

	private Connection connection;
	
	public boolean trainerlogin(String id, String pass) {
		
		

		connection=DBConnection.openConnection();
		
		String strselect="select * from trainerregistration where userid=? and password=?";
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			ps=connection.prepareStatement(strselect);
			
			ps.setString(1, id);
			ps.setString(2, pass);
			
			rs=ps.executeQuery();
			
			if(rs.next()) {
				
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	public Trainer_registration viewProfile(String id)
	{
		connection=DBConnection.openConnection();
		
		String strselect="select * from trainerregistration where userid=?";
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		 Trainer_registration r=null;
		
		try {
			ps=connection.prepareStatement(strselect);
			ps.setString(1, id);
			rs=ps.executeQuery();
			
			if(rs.next())
			{
				String name=rs.getString("name");
				String email=rs.getString("email");
				String phone=rs.getString("phone");
				String experince=rs.getString("experince");
				String discription=rs.getString("discription");
				String address=rs.getString("address");
				
				 //r=new Trainer_registration(name,email,phone,experince,discription,address);<1> another method we can also use
				
				
				//<2>this is another method 
				r=new Trainer_registration();
				
				r.setName(name);
				r.setEmail(email);
				r.setPhone(phone);
				r.setExperince(experince);
				r.setDiscription(discription);
				r.setAddress(address);
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return r;
	}

	public int trainer_editprofile(String id, Trainer_registration r) {
		
		connection=DBConnection.openConnection();
		
		String strupdate="update trainerregistration set name=?, email=?, phone=?, experince=?, discription=?, address=? where  userid=?";
		
		PreparedStatement ps=null;
		int status=0;
		try {
			ps=connection.prepareStatement(strupdate);
			ps.setString(1,r.getName());
			ps.setString(2,r.getEmail());
			ps.setString(3,r.getPhone());
			ps.setString(4,r.getExperince());
			ps.setString(5,r.getDiscription());
			ps.setString(6,r.getAddress());
			
			ps.setString(7, id);
			
			status=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		return status;
	}

	public boolean trainforgot(String id, String email) {
		connection=DBConnection.openConnection();
		String strselect="select * from trainerregistration where userid=? and email=?";
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		
	 try {
		ps=	connection.prepareStatement(strselect);
		
		
		ps.setString(1, id);
		ps.setString(2, email);
		
	rs=	ps.executeQuery();
	
	if(rs.next()) {
		
		return true;
	}
	
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		return false;
	}



	

	public int confirmpass(String id, Forgot_pass fs) {
		connection=DBConnection.openConnection();
		String strupdate="update trainerregistration set password=? where  userid=? and email=?";

		PreparedStatement ps=null;
		int status = 0;
		
	                 try {
						ps=   connection.prepareStatement(strupdate);
						
						ps.setString(1,fs.getPassword());
						ps.setString(2,fs.getCpass());
						
						status=ps.executeUpdate();
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
		return status;
	}
	
	
	public ArrayList<Admission_Form>viewtraineeid( String trainerid)
	{
		ArrayList<Admission_Form>traineelist=new ArrayList<>();

		connection=DBConnection.openConnection();

		String strselect="select * from tadmmisionrcv_form where trainerid=?";
		PreparedStatement ps=null;
		ResultSet rs=null;
		Admission_Form af=null;
		try {
			ps=connection.prepareStatement(strselect);
			
			ps.setString(1,trainerid);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				String  traineeid=rs.getString("id");
				
				af=new Admission_Form();
				af.setId(traineeid);
				traineelist.add(af);
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return traineelist;
		
		
		
		
		
		
	}

	public int addlog(RideLog rl) {
		connection=DBConnection.openConnection();
		
		String strselect="insert into ride_log(trainer_id, trainee_id, source, destination, duration, performance, devices, vehicle, date)value(?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement ps=null;
		int status=0;
		
		try {
		ps=	connection.prepareStatement(strselect);
		
		ps.setString(1,rl.getTrainerid());
		ps.setString(2,rl.getTraineeid());
		ps.setString(3,rl.getSource());
		ps.setString(4,rl.getDestination());
		ps.setString(5,rl.getDuration());
		ps.setString(6,rl.getPerformance());
		ps.setString(7,rl.getDeviceno());
		ps.setString(8,rl.getVechileno());
		ps.setString(9,rl.getDate());
		
		status=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	
}
