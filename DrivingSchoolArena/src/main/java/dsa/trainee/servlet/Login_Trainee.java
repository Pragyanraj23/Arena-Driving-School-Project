package dsa.trainee.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dsa.dao.TraineeDao;
import dsa.utilities.Messages;

/**
 * Servlet implementation class Login_Trainee
 */
@WebServlet("/Login_Trainee")
public class Login_Trainee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_Trainee() {
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
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		
		TraineeDao dao=new TraineeDao();
		
		boolean status=dao.login(id,password);
		if(status)
		{
			HttpSession hs=request.getSession();
			hs.setAttribute("traineekey", id);
			
			response.sendRedirect("/DrivingSchoolArena/trainee/trainee_home.jsp");
		}
		else {

			request.setAttribute("message", Messages.INVALID);
			RequestDispatcher rd=request.getRequestDispatcher("/trainee/trainee_login.jsp");
			rd.forward(request, response);
	}
		
		
	
	}

}
