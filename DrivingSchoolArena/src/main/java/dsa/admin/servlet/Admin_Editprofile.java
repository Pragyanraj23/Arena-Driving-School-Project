package dsa.admin.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import org.apache.jasper.compiler.Node.ForwardAction;

import dsa.beans.Admin_edit;
import dsa.dao.AdminDao;

/**
 * Servlet implementation class Admin_Editprofile
 */
@WebServlet("/Admin_Editprofile")
public class Admin_Editprofile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin_Editprofile() {
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
		String Userid=request.getParameter("id");
		String pass=request.getParameter("password");
		String number=request.getParameter("number");
		String email=request.getParameter("email");
		
		HttpSession hs=request.getSession();
		String id=(String)hs.getAttribute("adminkey");
		
		
		Admin_edit ad=new Admin_edit(Userid,pass,number,email);
				
		AdminDao dao= new AdminDao();
		
		int status=dao.admin_edit(id,ad);
		
		if(status>0)
		{
			request.setAttribute("message" ,"Profile update successfully");
			
		RequestDispatcher rd=	request.getRequestDispatcher("/admin/admin_editprofile.jsp");
		rd.forward(request, response);
			
			
		}
		
		
		
	}

}
