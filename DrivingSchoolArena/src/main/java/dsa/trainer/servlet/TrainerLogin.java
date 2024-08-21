package dsa.trainer.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dsa.dao.TrainerDao;
import dsa.utilities.Messages;

/**
 * Servlet implementation class TrainerLogin
 */
@WebServlet("/TrainerLogin")
public class TrainerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TrainerLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("Id");
		String pass = request.getParameter("password");

		TrainerDao dao = new TrainerDao();

		boolean status = dao.trainerlogin(id, pass);

		if (status == true) {

			HttpSession hs = request.getSession();

			hs.setAttribute("Trainerkey", id);
			response.sendRedirect("/DrivingSchoolArena/trainer/trainerhome.jsp");
		} 
		else {

			request.setAttribute("message",Messages.INVALID);
			RequestDispatcher rd=request.getRequestDispatcher("/trainer/Trainerlogin.jsp");
			rd.forward(request, response);
	}

}}
