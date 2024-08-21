package dsa.admin.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dsa.beans.Admission_Form;
import dsa.dao.AdminDao;


/**
 * Servlet implementation class ConfirmAdmission
 */
@WebServlet("/ConfirmAdmission")
public class ConfirmAdmission extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmAdmission() {
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
		
		boolean status=dao.checkid(id);
		
		if(status)
		{
			out.println("This id has been  already exists");
		}
		
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String ide=request.getParameter("id");
		  int aid=Integer.parseInt(ide);
		  String id=request.getParameter("id1");
		  String password=request.getParameter("password");
		  String Fees=request.getParameter("fees");
		  int fees=Integer.parseInt(Fees);
		  
		  
		  Admission_Form af=new Admission_Form(id,password,fees);
		  
		  AdminDao dao=new AdminDao();
		  
		  int status=dao.confirmadmission( af,aid);
		
		  if(status>0)
			{
				request.setAttribute("message" ,"Your Admission has been Confirm");
				
			RequestDispatcher rd=	request.getRequestDispatcher("/admin/admissionconfirmation.jsp");
			rd.forward(request, response);
				
				
			}
	}

}
