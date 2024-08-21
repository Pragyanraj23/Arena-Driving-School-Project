package dsa.utilities;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dsa.beans.Contactus;
import dsa.dao.CommonDao;

/**
 * Servlet implementation class Contact_Us
 */
@WebServlet("/Contact_Us")
public class Contact_Us extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contact_Us() {
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
		 String username=request.getParameter("name");
		 String email=request.getParameter("email");
		 String number=request.getParameter("number");
		 String Query=request.getParameter("query");
		 
		 
		 
		 System.out.println(username+email+number+Query);
		Contactus cu=new Contactus(username,email,number,Query);
	
		CommonDao dao=new  CommonDao();
		
	    int status =	dao.addContact(cu);
	    
	    if(status>0) {
	    	
	    	request.setAttribute("Message",Messages.SUCCESS1);
	    	RequestDispatcher dispatcher=request.getRequestDispatcher("/jsp/Contact_Us.jsp");
	    	dispatcher.forward(request, response);
	    	
	    	
	    }
	    else {
	    	request.setAttribute("Message","Something Wrong");
	    	RequestDispatcher dispatcher=request.getRequestDispatcher("/jsp/Contact_Us.jsp");
	    	dispatcher.forward(request, response);
	    	
	    }
}
}
