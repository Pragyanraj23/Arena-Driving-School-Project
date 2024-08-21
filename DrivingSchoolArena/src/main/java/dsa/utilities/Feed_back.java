package dsa.utilities;
import java.io.IOException;

import dsa.beans.*;
import dsa.dao.CommonDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Contact_Us
 */
@WebServlet("/Feedback")
public class Feed_back extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Feed_back() {
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
		 String review=request.getParameter("review");
		 String rating=request.getParameter("rating");
		 
		 Feedback fd=new Feedback(username,email,review,rating);
		 
		 CommonDao cd=new CommonDao();
		 
		 
		 int status1 =	cd.addfeedback(fd);
		  if(status1>0) {
		    	
		    	request.setAttribute("Message",Messages.SUCCESS2);
		    	RequestDispatcher dispatcher=request.getRequestDispatcher("/jsp/Feedback.jsp");
		    	dispatcher.forward(request, response);
		    	
		    	
		    }
		    
		 
	}

}