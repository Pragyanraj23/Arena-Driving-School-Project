package dsa.trainer.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dsa.beans.Trainer_registration;
import dsa.dao.TrainerDao;

/**
 * Servlet implementation class Trainer_Editprofile
 */
@WebServlet("/Trainer_Editprofile")
public class Trainer_Editprofile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Trainer_Editprofile() {
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
		 String phone=request.getParameter("phone");
		 String experince=request.getParameter("experince");
		 String discription=request.getParameter("discription");
		 String address=request.getParameter("address");
		 
		 
		 HttpSession hs=request.getSession(false);
		 
		 String id=(String)hs.getAttribute("Trainerkey");
		 
		 Trainer_registration r=new Trainer_registration(name,email,phone,experince,discription,address);
		 
	      TrainerDao dao=new TrainerDao();
	     int status=   dao.trainer_editprofile(id,r);
	     
	     if(status>0)
	     {
	    	 request.setAttribute("message", "profile updated Successfully");
	    	 RequestDispatcher d=request.getRequestDispatcher("/trainer/trainer_editprofile.jsp");
	    	 d.forward(request, response);
	     }
	
	}

}
