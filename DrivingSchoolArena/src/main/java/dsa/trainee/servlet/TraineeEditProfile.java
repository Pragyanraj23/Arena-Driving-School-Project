package dsa.trainee.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dsa.beans.Admission_Form;
import dsa.dao.TraineeDao;
import dsa.utilities.Messages;

/**
 * Servlet implementation class TraineeEditProfile
 */
@WebServlet("/TraineeEditProfile")
public class TraineeEditProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TraineeEditProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name=request.getParameter("name");
		 String email=request.getParameter("email");
		 String address=request.getParameter("address");
		 
		
		
		 String phone=request.getParameter("phone");
		 HttpSession hs=request.getSession(false);
		 String id=(String)hs.getAttribute("traineekey");
		 
		 Admission_Form a=new Admission_Form();
		 a.setName(name);
		 a.setEmail(email);
		 a.setPhoneno(phone);
		 
		 a.setAddress(address);
		 
		 TraineeDao dao=new TraineeDao();
		 
		 int status=dao.editProfile(a,id);
		 
		 if(status>0)
		 {

		    	request.setAttribute("Message","Details updated successfull");
		    	RequestDispatcher dispatcher=request.getRequestDispatcher("/trainee/editprofile.jsp");
		    	dispatcher.forward(request, response);
		    	
		 }
		 
		
	}

}
