package dsa.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;

import dsa.beans.Admin_edit;
import dsa.beans.Admission_Form;
import dsa.beans.Contactus;
import dsa.beans.Feedback;
import dsa.beans.Newsannouncement;
import dsa.beans.Program;
import dsa.beans.Trainer_registration;
import dsa.dbutil.DBConnection;

public class AdminDao {

	public Connection connection;

	public int addtrainer(Trainer_registration tr) {

		connection = DBConnection.openConnection();

		String strinsert = "insert into trainerregistration(userid, password, name, email, phone,  experince, discription, address)value(?,?,?,?,?,?,?,?)";

		PreparedStatement ps1 = null;
		int status = 0;

		try {
			ps1 = connection.prepareStatement(strinsert);

			ps1.setString(1, tr.getUserid());
			ps1.setString(2, tr.getPassword());
			ps1.setString(3, tr.getName());
			ps1.setString(4, tr.getEmail());
			ps1.setString(5, tr.getPhone());
			ps1.setString(6, tr.getExperince());
			ps1.setString(7, tr.getDiscription());
			ps1.setString(8, tr.getAddress());

			status = ps1.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return status;
	}

	public boolean adminlogin(String id, String password) {
		
		connection=DBConnection.openConnection();
		
		String strselect="select  *  from admin_detail where id=? and password=?";
		
		PreparedStatement ps= null;
		ResultSet rs=null;
		
		
		
		
		
	try {
		ps=	connection.prepareStatement(strselect);
		 
		ps.setString(1, id);
		ps.setString(2, password);
		
	rs=ps.executeQuery();
	if(rs.next()==true)
		 return true;
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		
		return false;
	}
	
	public ArrayList<Contactus> viewcontact()
	{
		
		ArrayList<Contactus>contactlist=new ArrayList<>();
		
		connection=DBConnection.openConnection();
		
		String strselect="select  *  from contactus";
		PreparedStatement ps2= null;
		ResultSet rs=null;
		Contactus c=null;
		
		
		
		       
		try {
			ps2 =connection.prepareStatement(strselect);
			
			rs=ps2.executeQuery();
			
			while(rs.next())
			{
				String s=rs.getString("serialno");
			int serialno=	Integer.parseInt(s);
				
			String name=	rs.getString( "name");
			String email=	rs.getString( "email");
			String phone=	rs.getString( "phone_no");
			String query=	rs.getString( "query");
			Date date=	rs.getDate( "date");
				
			 c=new  Contactus(serialno, name, email, phone, query, date);
			 
			  contactlist.add(c);
			 
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 return contactlist;
	}
	public ArrayList<Feedback> viewfeedback()
	{
		
		ArrayList<Feedback>feedbacktlist=new ArrayList<>();
		
		connection=DBConnection.openConnection();
		
		String strselect="select  *  from feedback";
		PreparedStatement ps3= null;
		ResultSet rs=null;
		Feedback c=null;
		
		
		
		       
		try {
			ps3 =connection.prepareStatement(strselect);
			
			rs=ps3.executeQuery();
			
			while(rs.next())
			{
				String s=rs.getString("serialno");
			int srno=	Integer.parseInt(s);
				
			String name=	rs.getString( "name");
			String email=	rs.getString( "email");
			String review=	rs.getString( "review");
			String rating=	rs.getString( "rating");
				
			 c=new  Feedback(name, email, review, rating, srno);
			 
			 feedbacktlist.add(c);
			 
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 return feedbacktlist;
}

	

	public int admin_edit(String id, Admin_edit ad) {
		connection=DBConnection.openConnection();
		
		String strupdate="update admin_detail set id=?,password=?,email=?,number=? where id=?";
		
		PreparedStatement ps=null;
		int status=0;
		
		try {
			ps=connection.prepareStatement(strupdate);
			
			ps.setString(1,ad.getUserid());
			ps.setString(2,ad. getPass());
			ps.setString(3, ad.getEmail());
			ps.setString(4,ad. getNumber());
			
			ps.setString(5, id);
			
			status=ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}

	

	public int addprogram(Program pg) {
        connection=DBConnection.openConnection();
		
		
		String strinsert="insert into  addprogram( pname, fees, discription)values(?,?,?)";
		 PreparedStatement ps=null;
         int status=0;
         
         try {
		ps=	connection.prepareStatement(strinsert);
			
		ps.setString(1,pg.getPname());
		ps.setString(2,pg. getFees());
		ps.setString(3,pg. getDiscription());
			
		status=ps.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return status;
	}
	public ArrayList<Program> viewprogram()
	{
		
		ArrayList<Program>programlist=new ArrayList<>();
		
		connection=DBConnection.openConnection();
		String strselect="select * from  addprogram ";
		PreparedStatement ps=null;
		ResultSet rs=null;
		Program p=null;
		
	try {
		ps=	connection.prepareStatement(strselect);
		
		rs=ps.executeQuery();
		
		while(rs.next())
		{
			String program=rs.getString("pname");
			String fees=rs.getString("fees");
			String discription=rs.getString("discription");
			
			p=new Program(program,fees,discription);
			
			programlist.add(p);
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		return programlist;
		
		
		
	}

	public int newsannounce(Newsannouncement na) {
		connection=DBConnection.openConnection();
		
		
		
		java.util.Date d=new java.util.Date();
		java.sql.Date sd=new java.sql.Date(d.getTime());
		
		String strinsert="insert into news_announcement( content, date)values(?,?)";
		
		PreparedStatement ps=null;
		int status=0;
		
		try {
			ps=connection.prepareStatement(strinsert);
			
			ps.setString(1,na.getContent());
			ps.setDate(2,sd);
			
			status=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return status;
	}
	
	
	public ArrayList<Newsannouncement> viewNewsannouncements()
	{
		ArrayList<Newsannouncement>list=new ArrayList<>();

		connection=DBConnection.openConnection();

		String strselect="select * from news_announcement";
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		Newsannouncement ns=null;
		
	try {
		ps=	connection.prepareStatement(strselect);
		rs=ps.executeQuery();
		while(rs.next())
		{
			String content=rs.getString("content");
			
			 ns=new Newsannouncement(content); 
			
			list.add(ns);
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return list;
	}
	
	public ArrayList<Admission_Form> viewAdmission()
	{
		ArrayList<Admission_Form>list=new ArrayList<>();

		connection=DBConnection.openConnection();

		String strselect="select * from tadmmisionrcv_form  where status=?";
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		Admission_Form af=null;
		
	try {
		ps=	connection.prepareStatement(strselect);
		
		ps.setString(1, "Not Confirm");
		rs=ps.executeQuery();
		while(rs.next())
		{
			int aid=Integer.parseInt(rs.getString("admissionid"));
			String name=rs.getString("name");
			String pname=rs.getString("program");
			String email=rs.getString("email");
			String address=rs.getString("address");
			String age=rs.getString("age");
			int ag=Integer.parseInt(age);
			
			 af=new Admission_Form(aid,name,email,address,pname,ag); 
			
			list.add(af);
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return list;
	}

	public Admission_Form checkid(int aid, String prg) {
		//System.out.println("Admissionid is "+aid);
		connection=DBConnection.openConnection();
		
		String str="select * from tadmmisionrcv_form where  admissionid=? and program=?";
		String strselect="select * from addprogram where pname=?";

		PreparedStatement ps1,ps2=null;
		ResultSet rs1,rs2=null;
		
		Admission_Form af=null;
		Program p=null;
	try {
		
      ps2=connection.prepareStatement(strselect);
		
		ps2.setString(1, prg);
		System.out.println("program name is   "+prg);
		rs2=ps2.executeQuery();
		int fees=0;
		if(rs2.next())
		{
		String	fee=rs2.getString("fees");
		System.out.println("String fees is "+fee);
		fees=Integer.parseInt(fee);
			
			
		}
		
		
		
		ps1=	connection.prepareStatement(str);
		ps1.setInt(1, aid);
		ps1.setString(2, prg);
		
		rs1=ps1.executeQuery();
		
		
		
		
		if(rs1.next())
		{
			String admissionid=rs1.getString("admissionid");
			String pname=rs1.getString("program");
			
			af=new Admission_Form();
			
			af.setP(p);
		  af.setFees(fees);
		  
		  System.out.println("Fees is "+fees);
		  af.setAdmissionid(Integer.parseInt(admissionid));
		  af.setProgram(pname);
		  
		  return af;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return null;	
}

	public int confirmadmission(Admission_Form af, int ide) {
		connection=DBConnection.openConnection();
		
		String strupdate="update tadmmisionrcv_form set id=?,password=?,fees=?, status=? where admissionid=?";
		
		PreparedStatement ps=null;
		int status=0;
		
		try {
			ps=connection.prepareStatement(strupdate);
			
			ps.setString(1,af.getId());
			ps.setString(2,af. getPassword());
			ps.setInt(3, af.getFees());
			
			ps.setString(4,"Confirmed");
			
			
			ps.setInt(5, ide);
			
			status=ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;
	}
	public ArrayList<Admission_Form> viewconfirmAdmission()
	{
		ArrayList<Admission_Form>list=new ArrayList<>();

		connection=DBConnection.openConnection();

		String strselect="select * from tadmmisionrcv_form  where status=?";
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		Admission_Form af=null;
		
	try {
		ps=	connection.prepareStatement(strselect);
		
		ps.setString(1, "Confirmed");
		rs=ps.executeQuery();
		while(rs.next())
		{
			String id=rs.getString("id");
			String password=rs.getString("password");
			String name=rs.getString("name");
			String prg=rs.getString("program");
			String address=rs.getString("address");
			String phone=rs.getString("phoneno");
			String fees=rs.getString("fees");
			int fee=Integer.parseInt(fees);
			
			 af=new Admission_Form(); 
			 af.setId(id);
			 af.setPassword(password);
			 af.setName(name);
			 af.setProgram(prg);
			 af.setAddress(address);
			 af.setPhoneno(phone);
			 af.setFees(fee);
			
			list.add(af);
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return list;
	}
	public ArrayList<Admission_Form> viewtrainee()
	{
		ArrayList<Admission_Form>list=new ArrayList<>();

		connection=DBConnection.openConnection();

		String strselect="select * from tadmmisionrcv_form  where status=? and trainerid is null";
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		Admission_Form af=null;
		
	try {
		ps=	connection.prepareStatement(strselect);
		
		ps.setString(1, "Confirmed");
		rs=ps.executeQuery();
		while(rs.next())
		{
			String id=rs.getString("id");
			String name=rs.getString("name");
			String email=rs.getString("email");
			String pname=rs.getString("program");
            String phone=rs.getString("phoneno");
			
			
			 af=new Admission_Form(); 
			 af.setId(id);
			 af.setName(name);
			 af.setEmail(email);
			 af.setProgram(pname); 
			 af.setPhoneno(phone);
			
			list.add(af);
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return list;
	}
	public ArrayList<Trainer_registration> viewtrainerdetails()
	{
		ArrayList<Trainer_registration>list=new ArrayList<>();

		connection=DBConnection.openConnection();

		String strselect="select * from trainerregistration";
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		Trainer_registration ns=null;
		
	try {
		ps=	connection.prepareStatement(strselect);
		rs=ps.executeQuery();
		while(rs.next())
		{
			String id=rs.getString("userid");
			String name=rs.getString("name");
			
			 ns=new Trainer_registration(id,name); 
			
			list.add(ns);
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return list;
	}

	public int assigntrainee(String traineeid[], String trainerid) {
		connection=DBConnection.openConnection();
		
		String update="update tadmmisionrcv_form set trainerid=? where id=?";
		PreparedStatement ps=null;
		int status=0;
		try {
			ps=connection.prepareStatement(update);
			
			for(int i=0; i<traineeid.length;i++)
			{
				ps.setString(2, traineeid[i]);
				ps.setString(1, trainerid);
				ps.addBatch();
				
			}
			int a[]=ps.executeBatch();
			
			
			for(int i=0; i<a.length;i++)
			{
				if(a[i]< 0)
				{
					status=0;
				}
				else 
				{
					status=1;
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return  status;
	}

	public boolean checkid(String id) {
		connection=DBConnection.openConnection();
		String strselect="select * from tadmmisionrcv_form where id=?";
		ResultSet rs=null;
		PreparedStatement ps=null;
		try {
			ps=connection.prepareStatement(strselect);
			ps.setString(1,id);
			
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

	public boolean checkTrainerid(String id) {
		
		connection=DBConnection.openConnection();
		String strselect="select * from trainerregistration where userid=?";
		ResultSet rs=null;
		PreparedStatement ps=null;
		try {
			ps=connection.prepareStatement(strselect);
			ps.setString(1,id);
			
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

	
	
	
}