package dsa.admin.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dsa.beans.Newsannouncement;
import dsa.dao.AdminDao;

/**
 * Servlet implementation class News_Announcement
 */
@WebServlet("/News_Announcement")
public class News_Announcement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public News_Announcement() {
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
		
		           String content=request.getParameter("content");
		           
		           System.out.println("content "+content);
		           Newsannouncement na=new Newsannouncement(content);
		           
		           AdminDao dao=new AdminDao();
		           
		      int status=  dao.newsannounce(na);
		           
		      if(status>0) {
	            	 
	            	 request.setAttribute("Message","Content Added Successfuly");
	     	    	RequestDispatcher dispatcher=request.getRequestDispatcher("/admin/news-announcement.jsp");
	     	    	dispatcher.forward(request, response);
	             }
	              
		
		
		
	}

}
