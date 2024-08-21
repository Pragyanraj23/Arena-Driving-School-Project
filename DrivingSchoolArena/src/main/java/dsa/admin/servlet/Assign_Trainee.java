package dsa.admin.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dsa.dao.AdminDao;

/**
 * Servlet implementation class Assign_Trainee
 */
@WebServlet("/Assign_Trainee")
public class Assign_Trainee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Assign_Trainee() {
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
		
		String traineeid[]= request.getParameterValues("id");
		String trainerid=request.getParameter("trainerid");
		
		System.out.println(traineeid);
		System.out.println(trainerid);
		AdminDao dao=new AdminDao();
		
		
		 int Status=dao.assigntrainee(traineeid,trainerid);
		 	
		 if(Status>0)
		 {
		 request.setAttribute("Message","Trainer Assign Successfuly");
	    	RequestDispatcher dispatcher=request.getRequestDispatcher("/admin/trainee_assignment.jsp");
	    	dispatcher.forward(request, response);
		 }
	}

}
