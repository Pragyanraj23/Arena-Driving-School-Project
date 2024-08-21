package dsa.admin.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dsa.beans.Trainer_registration;
import dsa.dao.AdminDao;
import dsa.utilities.Messages;


/**
 * Servlet implementation class TrainerRegistration
 */
@WebServlet("/TrainerRegistration")
public class TrainerRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrainerRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
       String id=request.getParameter("id");
		
		response.setContentType("type/html");
		PrintWriter out=response.getWriter();
		AdminDao dao=new AdminDao();
		
		boolean status=dao.checkTrainerid(id);
		
		if(status)
		{
			out.println("This id has been  already exists");
		}
		
		
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		              String userid=request.getParameter("ID");
		              String userpass=request.getParameter("Password");
		              String username=request.getParameter("name");
		     		 String email=request.getParameter("email");
		     		 String number=request.getParameter("phone");
		     		 String experince=request.getParameter("experince");
		     		 String discription=request.getParameter("discription");
		     		 String address=request.getParameter("address");
		     		 
		     		 
		     	Trainer_registration tr=new Trainer_registration(userid,userpass,username,email,number,experince,discription,address);
		     		 
		        AdminDao ad=new AdminDao();
		        
		        int status=ad.addtrainer(tr);
		        
		        
		        if(status>0) {
			    	
			    	request.setAttribute("Message",Messages.SUCCESS);
			    	RequestDispatcher dispatcher=request.getRequestDispatcher("admin/trainer_account.jsp");
			    	dispatcher.forward(request, response);
			    	
			    	
			    }
			    
		
	}

}
