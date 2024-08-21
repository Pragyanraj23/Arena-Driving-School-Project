package dsa.trainer.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dsa.beans.Admission_Form;
import dsa.beans.RideLog;
import dsa.dao.TrainerDao;
import dsa.utilities.Messages;

/**
 * Servlet implementation class Ride_Log
 */
@WebServlet("/Ride_Log")
public class Ride_Log extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    

	

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
		
		String trainerid=request.getParameter("trainerid");
		String traineeid=request.getParameter("traineeid");
		String source  =request.getParameter("source");
		String destination=request.getParameter("destination");
		String performance=request.getParameter("performance");
		String deviceno=request.getParameter("deviceno");
		String  vechileno=request.getParameter("vno");
		String date=request.getParameter("date");
		String duration=request.getParameter("duration");
		
		RideLog rl=new RideLog(trainerid,traineeid,source,destination,performance,deviceno,vechileno,date,duration);
		
		TrainerDao dao=new TrainerDao();
		
		int status=dao.addlog(rl);
		
		
		/*
		 * if(status>0) {
		 * 
		 * request.setAttribute("Message","ride log update successfully");
		 * RequestDispatcher dispatcher=request.getRequestDispatcher("");
		 * dispatcher.forward(request, response); }
		 */
	}

}
