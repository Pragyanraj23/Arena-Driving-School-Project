/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2024-05-25 12:03:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dsa.beans.Admission_Form;
import java.util.ArrayList;
import dsa.dao.AdminDao;

public final class pendingadmission_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/admin/adminheader.html", Long.valueOf(1716278683173L));
    _jspx_dependants.put("/Common/Common_Footer.html", Long.valueOf(1716471655357L));
    _jspx_dependants.put("/Common/Common_Js.html", Long.valueOf(1710242401621L));
    _jspx_dependants.put("/Common/Common_Css.html", Long.valueOf(1710329451747L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("dsa.beans.Admission_Form");
    _jspx_imports_classes.add("dsa.dao.AdminDao");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css\" integrity=\"sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("<link rel=\"icon\" href=\"/DrivingSchoolArena/images/favicon.png\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write(".nav-Link\r\n");
      out.write("{\r\n");
      out.write("color:white;\r\n");
      out.write("}\r\n");
      out.write("a:Link\r\n");
      out.write("{\r\n");
      out.write("color:black;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav-item{\r\n");
      out.write("\r\n");
      out.write("font-size:20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* a:visited\r\n");
      out.write("{\r\n");
      out.write("color:cyan;\r\n");
      out.write("\r\n");
      out.write("}  */\r\n");
      out.write("a:hover\r\n");
      out.write("{\r\n");
      out.write("color:Red !important;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("a:active\r\n");
      out.write("{\r\n");
      out.write("color:white !important;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".navbar-p\r\n");
      out.write("{\r\n");
      out.write("box-shadow:0px 2px 5px #777;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg  navbar-p \" style=\"background-color: aqua; \">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <h1 class=\"navbar-brand \" href=\"#\" style=\"margin-left: 80px;font-size:30px\"><img src=\"/DrivingSchoolArena/images/icons8.png\">DrivingSchoolArena</h1>\r\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"collapse navbar-collapse \" id=\"navbarSupportedContent\">\r\n");
      out.write("      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0 \">\r\n");
      out.write("        <li class=\"nav-item \"style=\"margin-left: 50px\">\r\n");
      out.write("          <a class=\"nav-link active \" aria-current=\"page\" href=\"/DrivingSchoolArena/admin/adminhome.jsp\">Home</a>\r\n");
      out.write("        </li>\r\n");
      out.write("          <!-- <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"/DrivingSchoolArena/admin/admin_viewProfile.jsp\">viewprofile</a>\r\n");
      out.write("        </li> -->\r\n");
      out.write("      <li class=\"nav-item dropdown\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle text-dark\" href=\"#\" role=\"button\"\r\n");
      out.write("					data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> View</a>\r\n");
      out.write("					<ul class=\"dropdown-menu\">\r\n");
      out.write("						<li><a class=\"dropdown-item\"\r\n");
      out.write("							href=\"/DrivingSchoolArena/admin/viewFeedback.jsp\">View Feedback</a></li>\r\n");
      out.write("						<li><a class=\"dropdown-item\"\r\n");
      out.write("							href=\" /DrivingSchoolArena/admin/viewContactus.jsp\">View Contactus</a></li>\r\n");
      out.write("						<li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("						\r\n");
      out.write("						<li><a class=\"dropdown-item\"\r\n");
      out.write("							href=\" /DrivingSchoolArena/admin/viewconfirmadmission.jsp\">View ConfirmAdmission</a></li>\r\n");
      out.write("						<li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("						\r\n");
      out.write("						<li><a class=\"dropdown-item\"\r\n");
      out.write("							href=\" /DrivingSchoolArena/admin/trainee_assignment.jsp\">Assign Trainer</a></li>\r\n");
      out.write("						<li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("						\r\n");
      out.write("					</ul></li>\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("         <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"/DrivingSchoolArena/admin/trainer_account.jsp\">Addtrainers</a>\r\n");
      out.write("        </li>\r\n");
      out.write("         <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"/DrivingSchoolArena/admin/addprogram.jsp\">Addprogram</a>\r\n");
      out.write("        </li>\r\n");
      out.write("         <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"/DrivingSchoolArena//admin/pendingadmission.jsp\">PendingAdmission</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        \r\n");
      out.write("      <!--    <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"/DrivingSchoolArena/admin/confirm_Admission.jsp\">ConfirmAdmission</a>\r\n");
      out.write("        </li> -->\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"/DrivingSchoolArena/admin/viewprogram.jsp\">Viewprogram</a>\r\n");
      out.write("        </li>\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"/DrivingSchoolArena/admin/news-announcement.jsp\">News-Announcement</a>\r\n");
      out.write("        </li>\r\n");
      out.write("         <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"/DrivingSchoolArena/Admin_logout\">Logout</a>\r\n");
      out.write("        </li>\r\n");
      out.write("         \r\n");
      out.write("        \r\n");
      out.write("      \r\n");
      out.write("      </ul>\r\n");
      out.write("     \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("<form action=\"/DrivingSchoolArena/Admission\"  method=\"post\">\r\n");


AdminDao dao=new AdminDao();
    ArrayList<Admission_Form> programview =  dao.viewAdmission();


      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table class=\"table\">\r\n");
      out.write("<tbody>\r\n");
      out.write("<tr>\r\n");
      out.write("<th> Admission id</th>\r\n");
      out.write("<th> Program name  </th>\r\n");
      out.write("<th> Name</th>\r\n");
      out.write("<th> Email</th>\r\n");
      out.write("<th> Address</th>\r\n");
      out.write("<th> Age</th>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
 
for( Admission_Form af:programview)
{
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td ><input type=\"radio\" readonly=\"readonly\"  name=\"admid\" value=\"");
      out.print(af.getAdmissionid());
      out.write("\"></td>\r\n");
      out.write("<td><input type=\"text\" readonly=\"readonly\" name=\"program");
      out.print(af.getAdmissionid());
      out.write("\"  value=\"");
      out.print(af.getProgram());
      out.write("\"></td>\r\n");
      out.write("<td>");
      out.print(af.getName());
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(af.getEmail());
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(af.getAddress());
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(af.getAge());
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</tbody>\r\n");
      out.write("<div class=\"text-center\">\r\n");
      out.write("						<button type=\"submit\"\r\n");
      out.write("							class=\" btn btn-secondary w-25 mt-4 mb-4 form-control\">Submit</button>\r\n");
      out.write("                   </div>\r\n");
      out.write("\r\n");
      out.write(" </form>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("					\r\n");
      out.write("\r\n");
      out.write(" ");
      out.write("<footer class=\"bg-body-tertiary text-center me-auto mb-1\">\r\n");
      out.write("  <!-- Grid container -->\r\n");
      out.write("  <div class=\"container p-4 pb-0\">\r\n");
      out.write("    <!-- Section: Social media -->\r\n");
      out.write("    <section class=\"mb-4\">\r\n");
      out.write("      <!-- Facebook -->\r\n");
      out.write("      <a\r\n");
      out.write("      data-mdb-ripple-init\r\n");
      out.write("        class=\"btn text-white btn-floating m-1\"\r\n");
      out.write("        style=\"background-color: #3b5998;\"\r\n");
      out.write("        href=\"https://www.facebook.com/\"\r\n");
      out.write("        role=\"button\"\r\n");
      out.write("        ><i class=\"fab fa-facebook-f\"></i\r\n");
      out.write("      ></a>\r\n");
      out.write("\r\n");
      out.write("      <!-- Twitter -->\r\n");
      out.write("      <!-- <a\r\n");
      out.write("        data-mdb-ripple-init\r\n");
      out.write("        class=\"btn text-white btn-floating m-1\"\r\n");
      out.write("        style=\"background-color: #55acee;\"\r\n");
      out.write("        href=\"#!\"\r\n");
      out.write("        role=\"button\"\r\n");
      out.write("        ><i class=\"fab fa-twitter\"></i\r\n");
      out.write("      ></a> -->\r\n");
      out.write("\r\n");
      out.write("      <!-- Google -->\r\n");
      out.write("      <a\r\n");
      out.write("        data-mdb-ripple-init\r\n");
      out.write("        class=\"btn text-white btn-floating m-1\"\r\n");
      out.write("        style=\"background-color: #dd4b39;\"\r\n");
      out.write("        href=\"https://mail.google.com/mail/\"\r\n");
      out.write("        role=\"button\"\r\n");
      out.write("        ><i class=\"fab fa-google\"></i\r\n");
      out.write("      ></a>\r\n");
      out.write("\r\n");
      out.write("      <!-- Instagram -->\r\n");
      out.write("      <a\r\n");
      out.write("        data-mdb-ripple-init\r\n");
      out.write("        class=\"btn text-white btn-floating m-1\"\r\n");
      out.write("        style=\"background-color: #ac2bac;\"\r\n");
      out.write("        href=\"https://www.instagram.com/\"\r\n");
      out.write("        role=\"button\"\r\n");
      out.write("        ><i class=\"fab fa-instagram\"></i\r\n");
      out.write("      ></a>\r\n");
      out.write("\r\n");
      out.write("      <!-- Linkedin -->\r\n");
      out.write("      <a\r\n");
      out.write("        data-mdb-ripple-init\r\n");
      out.write("        class=\"btn text-white btn-floating m-1\"\r\n");
      out.write("        style=\"background-color: #0082ca;\"\r\n");
      out.write("        href=\"https://www.linkedin.com/\"\r\n");
      out.write("        role=\"button\"\r\n");
      out.write("        ><i class=\"fab fa-linkedin-in\"></i\r\n");
      out.write("      ></a>\r\n");
      out.write("      <!-- Github -->\r\n");
      out.write("      <!-- <a\r\n");
      out.write("        data-mdb-ripple-init\r\n");
      out.write("        class=\"btn text-white btn-floating m-1\"\r\n");
      out.write("        style=\"background-color: #333333;\"\r\n");
      out.write("        href=\"#!\"\r\n");
      out.write("        role=\"button\"\r\n");
      out.write("        ><i class=\"fab fa-github\"></i\r\n");
      out.write("      ></a> -->\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- Section: Social media -->\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Grid container -->\r\n");
      out.write("\r\n");
      out.write("  <!-- Copyright -->\r\n");
      out.write("  <div class=\"text-center p-3\" style=\"background-color: rgba(0, 0, 0, 0.05);\">\r\n");
      out.write("    \r\n");
      out.write("    <p class=\"\" > 2024 Copyright: Driving School Arena </p>\r\n");
      out.write("    <p class=\"\"> Created by Pragyan Raj</p>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Copyright -->\r\n");
      out.write("</footer>");
      out.write('\r');
      out.write('\n');
      out.write(' ');
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
