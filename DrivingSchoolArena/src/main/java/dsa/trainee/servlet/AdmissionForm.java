package dsa.trainee.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dsa.beans.Admission_Form;
import dsa.dao.TraineeDao;

/**
 * Servlet implementation class AdmissionForm
 */
@WebServlet("/AdmissionForm")
public class AdmissionForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdmissionForm() {
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
		 String age=request.getParameter("age");
		int ag= Integer.parseInt(age);
		 
		 String programe=request.getParameter("program");
		 String gender=request.getParameter("gender");
		 String phone=request.getParameter("phone");
		 
		 System.out.println(address);
		// System.out.println(pro);
		 Admission_Form a=new Admission_Form(name, email, address, programe, gender, phone, ag);
		  TraineeDao dao=new TraineeDao();
		 int status= dao.admission_re(a);
		 
		 if(status>0) {
		    	
		    	request.setAttribute("Message","Admission Form Send Successfuly");
		    	RequestDispatcher dispatcher=request.getRequestDispatcher("/trainee/admission_form.jsp");
		    	dispatcher.forward(request, response);
		    	
		    	
		    }
		    
	}

}
