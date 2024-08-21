package dsa.trainer.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dsa.beans.Forgot_pass;
import dsa.beans.Trainer_registration;
import dsa.dao.TrainerDao;

/**
 * Servlet implementation class Confirm_pass
 */
@WebServlet("/Confirm_pass")
public class Confirm_pass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Confirm_pass() {
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
		
		
		String password=request.getParameter("pass");
		String cpass=request.getParameter("confirm-pass");
		
		HttpSession hs=request.getSession(false);
		String id=(String)hs.getAttribute("Trainerkey");
		
		Forgot_pass fs=new Forgot_pass(password,cpass);
		
		TrainerDao dao=new TrainerDao();
		
		int status=	dao.confirmpass(id,fs);
		
		if(status>0)
		{
			request.setAttribute("Message", "password update successfully");
			RequestDispatcher rs=request.getRequestDispatcher("/trainer/confirm_pass.jsp");
			rs.forward(request, response);
			
		}
	}

}
