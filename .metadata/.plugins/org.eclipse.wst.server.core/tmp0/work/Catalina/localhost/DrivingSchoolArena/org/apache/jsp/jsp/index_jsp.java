/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2024-06-11 13:43:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import dsa.dao.AdminDao;
import dsa.beans.Newsannouncement;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/Common/Common_header.html", Long.valueOf(1716279760690L));
    _jspx_dependants.put("/Common/commoncarsouel.html", Long.valueOf(1710754893067L));
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
    _jspx_imports_classes.add("dsa.beans.Newsannouncement");
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
      out.write("<title>Home page</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css\" integrity=\"sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("<link rel=\"icon\" href=\"/DrivingSchoolArena/images/favicon.png\">\r\n");
      out.write('\r');
      out.write('\n');
      out.write("<style>\r\n");
      out.write(".carousel-item {\r\n");
      out.write("	height: 86vh;\r\n");
      out.write("	min-height: 300px;\r\n");
      out.write("	background-repeat: no-repeat scroll center scroll;\r\n");
      out.write("	webkit-background-size: cover;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".carousel-item::before {\r\n");
      out.write("	content: \"\";\r\n");
      out.write("	display: block;\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	top: 0;\r\n");
      out.write("	bottom: 0;\r\n");
      out.write("	left: 0;\r\n");
      out.write("	right: 0;\r\n");
      out.write("	background: black;\r\n");
      out.write("	opacity: 0.7;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".carousel-caption {\r\n");
      out.write("	bottom: 180px;\r\n");
      out.write("	padding-left: 100px;\r\n");
      out.write("	padding-right: 100px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".carousel-caption h5 {\r\n");
      out.write("	font-size: 100px;\r\n");
      out.write("	font-weight: 700;\r\n");
      out.write("	font-style: italic;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".carousel-caption p {\r\n");
      out.write("	font-size: 18px;\r\n");
      out.write("	top: 2rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".slider-btn {\r\n");
      out.write("	margin-top: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".slider-btn .btn {\r\n");
      out.write("	background-color: orange;\r\n");
      out.write("	color: Black;\r\n");
      out.write("	border-radius: 0;\r\n");
      out.write("	padding: 1.5rem 2rem;\r\n");
      out.write("	font-size: 1rem;\r\n");
      out.write("	margin-right: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".slider-btn .btn2 {\r\n");
      out.write("	color: black;\r\n");
      out.write("	background-color: white;\r\n");
      out.write("}\r\n");
      out.write("</style>");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".nav-Link {\r\n");
      out.write("	color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img:hover {\r\n");
      out.write("	transform: scaleX(-1); /* Flips the image horizontally on hover */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p {\r\n");
      out.write("	font-weight: 700;\r\n");
      out.write("	font-style: italic;\r\n");
      out.write("	color: #808080;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* body\r\n");
      out.write("{\r\n");
      out.write("background-image: url(\" /DrivingSchoolArena/images/bg11.jpg\");\r\n");
      out.write("background-size: cover;\r\n");
      out.write("} */\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".nav-Link {\r\n");
      out.write("	color: white;\r\n");
      out.write("	font-size:20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav-item{\r\n");
      out.write("\r\n");
      out.write("font-size:20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* a:Link {\r\n");
      out.write("	color: white;\r\n");
      out.write("}\r\n");
      out.write(" */\r\n");
      out.write("/* a:visited\r\n");
      out.write("{\r\n");
      out.write("color:cyan;\r\n");
      out.write("\r\n");
      out.write("}  */\r\n");
      out.write("a:hover {\r\n");
      out.write("	color: Red !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a:active {\r\n");
      out.write("	color: White !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar-p {\r\n");
      out.write("	box-shadow: 2px 2px 4px #777;\r\n");
      out.write("}\r\n");
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
      out.write("<nav class=\"navbar navbar-expand-lg  navbar-p \"\r\n");
      out.write("	style=\"background-color: #585a59;\">\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("		<h1 class=\"navbar-brand \" href=\"#\"\r\n");
      out.write("			style=\"margin-left: 80px; font-size: 30px\">\r\n");
      out.write("			<img src=\"/DrivingSchoolArena/images/icons8.png\">DrivingSchoolArena\r\n");
      out.write("		</h1>\r\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("			data-bs-target=\"#navbarSupportedContent\"\r\n");
      out.write("			aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("			aria-label=\"Toggle navigation\">\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		</button>\r\n");
      out.write("		<div class=\"collapse navbar-collapse \" id=\"navbarSupportedContent\">\r\n");
      out.write("			<ul class=\"navbar-nav me-auto mb-2 mb-lg-0 \">\r\n");
      out.write("				<li class=\"nav-item\" style=\"margin-left: 200px\"><a\r\n");
      out.write("					class=\"nav-link active text-light\" aria-current=\"page\"\r\n");
      out.write("					href=\" /DrivingSchoolArena/jsp/index.jsp\">Home</a></li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link text-light\"\r\n");
      out.write("					href=\"/DrivingSchoolArena/jsp/Contact_Us.jsp\">ContactUs</a></li>\r\n");
      out.write("				\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link text-light\"\r\n");
      out.write("					href=\"/DrivingSchoolArena/jsp/aboutus.jsp\">AboutUs</a></li>\r\n");
      out.write("  <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link text-light\" href=\"/DrivingSchoolArena/jsp/coomonview.jsp\">Viewprogram</a>\r\n");
      out.write("        </li>\r\n");
      out.write("				\r\n");
      out.write("				<li class=\"nav-item dropdown\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle text-light\" href=\"#\" role=\"button\"\r\n");
      out.write("					data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> Login </a>\r\n");
      out.write("					<ul class=\"dropdown-menu\">\r\n");
      out.write("						<li><a class=\"dropdown-item\"\r\n");
      out.write("							href=\"/DrivingSchoolArena/admin/admin_login.jsp\">Admin</a></li>\r\n");
      out.write("						<li><a class=\"dropdown-item\"\r\n");
      out.write("							href=\" /DrivingSchoolArena/trainer/Trainerlogin.jsp\">Trainer</a></li>\r\n");
      out.write("						<li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("						<li><a class=\"dropdown-item\"\r\n");
      out.write("							href=\"/DrivingSchoolArena/trainee/trainee_login.jsp\">Trainee</a></li>\r\n");
      out.write("					</ul></li>\r\n");
      out.write("				<li class=\"nav-item dropdown\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle text-light\" href=\"#\" role=\"button\"\r\n");
      out.write("					data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> Online\r\n");
      out.write("						Admission </a>\r\n");
      out.write("\r\n");
      out.write("					<ul class=\"dropdown-menu\">\r\n");
      out.write("						<li><a class=\"dropdown-item\"\r\n");
      out.write("							href=\"/DrivingSchoolArena/trainee/admission_form.jsp\">Tranee\r\n");
      out.write("								Admission form</a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				<li class=\"nav-item dropdown\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle text-light\" href=\"#\" role=\"button\"\r\n");
      out.write("					data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> Rules </a>\r\n");
      out.write("\r\n");
      out.write("					<ul class=\"dropdown-menu\">\r\n");
      out.write("						<li><a class=\"dropdown-item\"\r\n");
      out.write("							href=\"/DrivingSchoolArena/jsp/aboutroadsignals.jsp\">Road\r\n");
      out.write("								Signals</a></li>\r\n");
      out.write("						<li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("\r\n");
      out.write("						<!-- <li><a class=\"dropdown-item\"\r\n");
      out.write("							href=\"#\">Crossing\r\n");
      out.write("								Rule</a></li> -->\r\n");
      out.write("\r\n");
      out.write("					</ul>\r\n");
      out.write("			</ul>\r\n");
      out.write("			\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>");
      out.write('\r');
      out.write('\n');
      out.write('	');

	AdminDao dao=new AdminDao();
	
  ArrayList<Newsannouncement> newsview=dao.viewNewsannouncements();
	
      out.write('\r');
      out.write('\n');
      out.write('	');
 
	
for(Newsannouncement ns:newsview)
{
	
      out.write("\r\n");
      out.write("<marquee style=\" border:6px solid; direction =\"up\"; border-radius:7px ;>");
      out.print(ns.getContent() );
      out.write("</marquee> \r\n");
      out.write(" \r\n");
} 
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<div id=\"carouselExampleCaptions\" class=\"carousel slide\"\r\n");
      out.write("		data-bs-ride=\"carousel\">\r\n");
      out.write("		<div class=\"carousel-indicators\">\r\n");
      out.write("			<button type=\"button\" data-bs-target=\"#carouselExampleCaptions\"\r\n");
      out.write("				data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\"\r\n");
      out.write("				aria-label=\"Slide 1\"></button>\r\n");
      out.write("			<button type=\"button\" data-bs-target=\"#carouselExampleCaptions\"\r\n");
      out.write("				data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\r\n");
      out.write("			<button type=\"button\" data-bs-target=\"#carouselExampleCaptions\"\r\n");
      out.write("				data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\r\n");
      out.write("					<!-- <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\"\r\n");
      out.write("				data-bs-slide-to=\"3\" aria-label=\"Slide 4\"></button> -->\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"carousel-inner\">\r\n");
      out.write("			<div class=\"carousel-item active\">\r\n");
      out.write("				<img src=\"/DrivingSchoolArena/images/bg1.jpg\" class=\"d-block w-100\"\r\n");
      out.write("					alt=\"...\">\r\n");
      out.write("				<div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("					<h5>Start Journey</h5>\r\n");
      out.write("					<p>Everything in life is somewhere else, and you get there in a\r\n");
      out.write("						car.</p>\r\n");
      out.write("					<div class=\"slider-btn\">\r\n");
      out.write("						\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"carousel-item\">\r\n");
      out.write("				<img src=\"/DrivingSchoolArena/images/forbg.jpg\"\r\n");
      out.write("					class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("				<div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("					<h5>Know More</h5>\r\n");
      out.write("					<p>Good cars get you from point A to point B.</p>\r\n");
      out.write("					<div class=\"slider-btn\">\r\n");
      out.write("						<button class=\"btn btn1\" ><a href=\"/DrivingSchoolArena/jsp/aboutus.jsp\"> About Us</a></button>\r\n");
      out.write("						<button class=\"btn btn2\"><a href=\"/DrivingSchoolArena/jsp/Contact_Us.jsp\"> Contact Us</a></button>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"carousel-item\">\r\n");
      out.write("				<img src=\"/DrivingSchoolArena/images/bg11.jpg\"\r\n");
      out.write("					class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("				<div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("					<h5>First Step</h5>\r\n");
      out.write("					<p>Fill The Form And Start Your Journey.</p>\r\n");
      out.write("					<div class=\"slider-btn\">\r\n");
      out.write("						<button class=\"btn btn1\"><a href=\"/DrivingSchoolArena/trainee/admission_form.jsp\">Online Admission Form</a></button>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<button class=\"carousel-control-prev\" type=\"button\"\r\n");
      out.write("			data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"prev\">\r\n");
      out.write("			<span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span> <span\r\n");
      out.write("				class=\"visually-hidden\">Previous</span>\r\n");
      out.write("		</button>\r\n");
      out.write("		<button class=\"carousel-control-next\" type=\"button\"\r\n");
      out.write("			data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"next\">\r\n");
      out.write("			<span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span> <span\r\n");
      out.write("				class=\"visually-hidden\">Next</span>\r\n");
      out.write("		</button>\r\n");
      out.write("	</div>\r\n");
      out.write("	<hr style=\"border-width: 10px; color: red; margin-top: 0px;\">\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-4\"></div>\r\n");
      out.write("			<div class=\"col-4 text-center\"\r\n");
      out.write("				style=\"font-size: 40px; margin-top: 24px;\">\r\n");
      out.write("\r\n");
      out.write("				<strong style=\"text-decoration: underline;\">SERVICES</strong>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"row mt-5 \" style=\"margin-left: 150px;\">\r\n");
      out.write("			<div class=\" col-4 \">\r\n");
      out.write("				<img alt=\"\" src=\" /DrivingSchoolArena/images/sicons1.jpeg\"\r\n");
      out.write("					style=\"width: 300px; height: 200px; border-radius: 70px;\">\r\n");
      out.write("				<h1 style=\"margin-left: 60px; font-size: 30px; font-weight: 700\">Car-Training</h1>\r\n");
      out.write("				<p>If you are interested in enrolling in a car training course,\r\n");
      out.write("					you can explore these options and choose one that suits your needs.\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\" col-4\">\r\n");
      out.write("				<img alt=\"\" src=\" /DrivingSchoolArena/images/sicons2.jpeg\"\r\n");
      out.write("					style=\"width: 300px; height: 200px; border-radius: 70px\">\r\n");
      out.write("				<h1 style=\"margin-left: 55px; font-size: 30px; font-weight: 700\">Bike-Training</h1>\r\n");
      out.write("				<p>If you are interested in enrolling in a motor-bike training\r\n");
      out.write("					course, you can explore these options and choose one that suits\r\n");
      out.write("					your needs.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img alt=\"\" src=\" /DrivingSchoolArena/images/sicons3.jpeg\"\r\n");
      out.write("					style=\"width: 300px; height: 200px; border-radius: 70px\">\r\n");
      out.write("				<h1 style=\"margin-left: 35px; font-size: 30px; font-weight: 700\">Vechile-Training</h1>\r\n");
      out.write("				<p>If you are interested in enrolling in a large vehicle\r\n");
      out.write("					training course, you can explore these options and choose one that\r\n");
      out.write("					suits your needs.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"row mt-5\">\r\n");
      out.write("		<div class=\"col-5 bg-\">\r\n");
      out.write("		<h1></h1>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!--\r\n");
      out.write("		<div class=\"col-2\">\r\n");
      out.write("		<img alt=\"\" src=\"/DrivingSchoolArena/images/boysad3.jpeg\" style=\"width: 300px; height: 200px; border-radius: 100%;border-color:red;\">\r\n");
      out.write("		\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"col-5 \">\r\n");
      out.write("		<p>A good administrative review often highlights the individuals organizational skills efficiency and ability to support management and staff effectively. Here's an example of a positive review for an admin.</p>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"row mt-5\">\r\n");
      out.write("		<div class=\"col-5 bg-warning\">\r\n");
      out.write("		<h1>Trainer</h1>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"col-2\">\r\n");
      out.write("		<img alt=\"\" src=\"/DrivingSchoolArena/images/boysad2.jpeg\" style=\"width: 300px; height: 200px; border-radius: 100%;\">\r\n");
      out.write("		\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		</div>\r\n");
      out.write("-->\r\n");
      out.write("	\r\n");
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
      out.write("\r\n");
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
