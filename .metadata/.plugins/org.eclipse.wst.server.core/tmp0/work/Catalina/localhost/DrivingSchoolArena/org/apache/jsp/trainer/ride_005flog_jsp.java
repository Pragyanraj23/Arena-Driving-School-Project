/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2024-06-11 14:49:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.trainer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dsa.beans.Admission_Form;
import dsa.dao.TrainerDao;
import dsa.beans.Program;
import java.util.ArrayList;
import dsa.dao.AdminDao;

public final class ride_005flog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/Common/Common_Footer.html", Long.valueOf(1716471655357L));
    _jspx_dependants.put("/Common/Common_Js.html", Long.valueOf(1710242401621L));
    _jspx_dependants.put("/Common/Common_Css.html", Long.valueOf(1710329451747L));
    _jspx_dependants.put("/trainer/trainerheader.html", Long.valueOf(1716278660183L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("dsa.beans.Program");
    _jspx_imports_classes.add("dsa.dao.TrainerDao");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("	background-image: url(\"/DrivingSchoolArena/images/pixel.jpg\");\r\n");
      out.write("	background-repeat: no-repeat;\r\n");
      out.write("	background-size: cover;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css\" integrity=\"sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("<link rel=\"icon\" href=\"/DrivingSchoolArena/images/favicon.png\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Ride Log</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("     <style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write(".nav-Link\r\n");
      out.write("{\r\n");
      out.write("color:white;\r\n");
      out.write("font-size:20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".nav-item{\r\n");
      out.write("\r\n");
      out.write("font-size:20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a:Link\r\n");
      out.write("{\r\n");
      out.write("color:black;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
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
      out.write("color:White !important;\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg  navbar-p \" style=\"background-color: fuchsia; \">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <h1 class=\"navbar-brand \" href=\"#\" style=\"margin-left: 80px;font-size:30px\"><img src=\"/DrivingSchoolArena/images/icons8.png\">DrivingSchoolArena</h1>\r\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"collapse navbar-collapse \" id=\"navbarSupportedContent\">\r\n");
      out.write("      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0 \">\r\n");
      out.write("        <li class=\"nav-item \"style=\"margin-left: 250px\">\r\n");
      out.write("          <a class=\"nav-link active \" aria-current=\"page\" href=\"/DrivingSchoolArena//trainer/trainerhome.jsp\">Home</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"/DrivingSchoolArena//trainer/trainer_viewProfile.jsp\">viewProfile</a>\r\n");
      out.write("        </li>\r\n");
      out.write("         <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"/DrivingSchoolArena/trainer/ride_log.jsp\">Ride Log</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"/DrivingSchoolArena/trainer/trainer_editprofile.jsp\">Editprofile</a>\r\n");
      out.write("        </li>\r\n");
      out.write("         <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"/DrivingSchoolArena/TrainerLogout\">Logout</a>\r\n");
      out.write("        </li>\r\n");
      out.write("         \r\n");
      out.write("        \r\n");
      out.write("      \r\n");
      out.write("      </ul>\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("	\r\n");

String trainerid=(String)session.getAttribute("Trainerkey");
TrainerDao dao=new TrainerDao();
//System.out.println("trainerid")
ArrayList<Admission_Form>list=dao.viewtraineeid(trainerid);

      out.write("\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("<!-- end view profile code -->\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container mt-4\">\r\n");
      out.write("		<div class=\"row text-light\">\r\n");
      out.write("			<div class=\"col-3\"></div>\r\n");
      out.write("			<div class=\"col-5 mt-4\">\r\n");
      out.write("				<h1 class=\"text-center \">Ride Log</h1>\r\n");
      out.write("				<form class=\"needs-validation\" novalidate method=\"post\"\r\n");
      out.write("					action=\" /DrivingSchoolArena/Ride_Log\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<div class=\"input-group mt-2\">\r\n");
      out.write("						<label for=\"trainer id\" class=\"input-group-text\">Trainer_id</label> <input\r\n");
      out.write("							type=\"text\" value=\"");
      out.print(trainerid );
      out.write("\"   readonly=\"readonly\"\r\n");
      out.write("							required=\"required\" class=\"form-control\" name=\"trainerid\">\r\n");
      out.write("						\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"input-group mt-2\">\r\n");
      out.write("						<select class=\"form-control  text-center\" name=\"traineeid\">\r\n");
      out.write("							<option value=\"default\">Choose Trainee</option>\r\n");
      out.write("							");
for(Admission_Form tr:list) 
                                {
                                          
      out.write("\r\n");
      out.write("							<option value=\"");
      out.print(tr.getId());
      out.write('"');
      out.write('>');
      out.print(tr.getId());
      out.write("</option>\r\n");
      out.write("						\r\n");
      out.write("						           ");
} 
      out.write("\r\n");
      out.write("						</select>\r\n");
      out.write("						\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"input-group mt-2\">\r\n");
      out.write("						<label for=\"source\" class=\"input-group-text\">Source</label> <input\r\n");
      out.write("							type=\"text\" placeholder=\"please enter your source\"\r\n");
      out.write("							required=\"required\" class=\"form-control\" name=\"source\">\r\n");
      out.write("						<div class=\"invalid-feedback\">Please enter source</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\" input-group mt-2 \">\r\n");
      out.write("						<label for=\"destination\" class=\"input-group-text \">Destination</label> <input\r\n");
      out.write("							type=\"text\"  name=\"destination\" value=\"\" class=\"form-control\">\r\n");
      out.write("						<div class=\"invalid-feedback\">Please enter your destination</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\" input-group mt-2 \">\r\n");
      out.write("						<label for=\"duration\" class=\"input-group-text \">Duration</label> <input\r\n");
      out.write("							type=\"text\"  name=\"duration\" value=\"\" class=\"form-control\">\r\n");
      out.write("						<div class=\"invalid-feedback\">Please enter your duration</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"input-group mt-2\">\r\n");
      out.write("						<label for=\"performance\" class=\"input-group-text\">Performance</label> <input\r\n");
      out.write("							type=\"text\" placeholder=\"please enter the performance\"\r\n");
      out.write("							required=\"required\" class=\"form-control\" name=\"performance\">\r\n");
      out.write("						<div class=\"invalid-feedback\">Please enter the Performance</div>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"input-group mt-2\">\r\n");
      out.write("						<label for=\"Device No\" class=\"input-group-text\">DeviceNo</label> <input\r\n");
      out.write("							type=\"text\" placeholder=\"please enter the Device_No\"\r\n");
      out.write("							required=\"required\" class=\"form-control\" name=\"deviceno\">\r\n");
      out.write("						<div class=\"invalid-feedback\">Please enter the deviceno</div>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"input-group mt-2\">\r\n");
      out.write("						<label for=\"Vechile No\" class=\"input-group-text\">VehicleNo</label> <input\r\n");
      out.write("							type=\"text\" placeholder=\"please enter the vehicle No\"\r\n");
      out.write("							required=\"required\" class=\"form-control\" name=\"vno\">\r\n");
      out.write("						<div class=\"invalid-feedback\">Please enter the Vechile No</div>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"input-group mt-2\">\r\n");
      out.write("						<label for=\"Date\" class=\"input-group-text\">Date</label> <input\r\n");
      out.write("							type=\"Date\" placeholder=\"please enter the performance\"\r\n");
      out.write("							required=\"required\" class=\"form-control\" name=\"date\">\r\n");
      out.write("						<div class=\"invalid-feedback\">Please enter the Date</div>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("					\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"text-center\">\r\n");
      out.write("						<button type=\"submit\"\r\n");
      out.write("							class=\" btn btn-secondary w-25 mt-4 mb-4 form-control\">Submit</button>\r\n");
      out.write("						\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("				</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<script src=\"/DrivingSchoolArena/Common/validation.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	");
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
      out.write('	');
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
