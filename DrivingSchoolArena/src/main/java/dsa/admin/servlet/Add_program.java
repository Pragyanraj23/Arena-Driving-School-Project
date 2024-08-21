package dsa.admin.servlet;

import java.io.IOException;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dsa.beans.Program;
import dsa.dao.AdminDao;
import dsa.utilities.Messages;

/**
 * Servlet implementation class Add_program
 */
@WebServlet("/Add_program")
public class Add_program extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add_program() {
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
		
		String pname=request.getParameter("pname");
		String fees=request.getParameter("fees");
		String discription=request.getParameter("discription");
		
		Program pg=new Program(pname,fees,discription);
		
		AdminDao dao=new AdminDao();
		
	          int status=	dao.addprogram(pg);
	              
	             if(status>0) {
	            	 
	            	 request.setAttribute("Message",Messages.SUCCESS3);
	     	    	RequestDispatcher dispatcher=request.getRequestDispatcher("/admin/addprogram.jsp");
	     	    	dispatcher.forward(request, response);
	             }
	              
	              
		
		
	}

}
