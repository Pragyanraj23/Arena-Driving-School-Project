package dsa.admin.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dsa.beans.Admission_Form;
import dsa.dao.AdminDao;

/**
 * Servlet implementation class Admission
 */
@WebServlet("/Admission")
public class Admission extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admission() {
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
		
		String aid =request.getParameter("admid");
		String prg =request.getParameter("program"+aid);
		int admissionid=Integer.parseInt(aid);
		AdminDao dao=new AdminDao();
		Admission_Form af=dao.checkid(admissionid,prg);
		
		System.out.println("Admission id is "+af.getAdmissionid());
		
		
		if(af!=null)
		{
			request.setAttribute("af",af);
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("/admin/confirm_Admission.jsp");
			
			dispatcher.forward(request, response);
		}
		
		
	}

}
