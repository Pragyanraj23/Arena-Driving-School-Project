package dsa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dsa.beans.Contactus;
import dsa.beans.Feedback;
import dsa.dbutil.DBConnection;
import dsa.utilities.Contact_Us;

public class CommonDao {

	public Connection connection;
	
public	int  addContact(Contactus cu)
	{
		
	
	java.util.Date d=new java.util.Date();
	
	java.sql.Date sd=new java.sql.Date(d.getTime());
	
	
		connection=DBConnection.openConnection();
		
		
		String strinsert="insert into  contactus( name, email, phone_no, query,date)values(?,?,?,?,?)";
		
		PreparedStatement ps=null;
		int status=0;
		try {
			ps=connection.prepareStatement(strinsert);
			
			ps.setString(1,cu.getName());
			ps.setString(2,cu.getEmail());
			ps.setString(3,cu.getNumber());
			ps.setString(4,cu.getQuery());
			ps.setDate(5,sd);
			
			status=ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return status;
		
	}
public int addfeedback(Feedback fd) {
	connection=DBConnection.openConnection();
       String fdinsert= "insert into feedback( name, email, review, rating)values(?,?,?,?)";
       PreparedStatement ps1=null;
       
       int status1=0 ;
		try {
			ps1=connection.prepareStatement(fdinsert);
			
			ps1.setString(1,fd.getName());
			ps1.setString(2,fd.getEmail());
			ps1.setString(3,fd.getReview());
			ps1.setString(4,fd.getRating());
			
			status1=ps1.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return status1;
		
	}
       
	
}

