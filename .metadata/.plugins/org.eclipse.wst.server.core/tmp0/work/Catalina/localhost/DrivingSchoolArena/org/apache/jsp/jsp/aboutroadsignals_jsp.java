/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2024-05-25 07:41:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutroadsignals_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/Common/Common_header.html", Long.valueOf(1716279760690L));
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
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css\"\r\n");
      out.write("	integrity=\"sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==\"\r\n");
      out.write("	crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css\" integrity=\"sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("<link rel=\"icon\" href=\"/DrivingSchoolArena/images/favicon.png\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>About us page</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("	background-image: url(\" /DrivingSchoolArena/images/bg9.jpeg\" );\r\n");
      out.write("	background-size: cover;\r\n");
      out.write("	background-position: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img {\r\n");
      out.write("	border-radius: 50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p {\r\n");
      out.write("	font-family: sans-serif;\r\n");
      out.write("	font-size: medium;\r\n");
      out.write("	color: dark;\r\n");
      out.write("	font-size: medium;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"container mt-4 me-4 \" style=\"margin-bottom: 10%\">\r\n");
      out.write("			<div class=\"row vh-5\">\r\n");
      out.write("				<div class=\"col-3\" style=\"margin-left: 130px;\">\r\n");
      out.write("					<img alt=\"\" src=\"/DrivingSchoolArena/images/red.jpeg\"\r\n");
      out.write("						style=\"width: 120px;\">\r\n");
      out.write("					<h1 style=\"color: red;\">Red light</h1>\r\n");
      out.write("					<p>The color 'RED' on the signal light indicates to stop well\r\n");
      out.write("						before the stop line and not to crowd the intersection. Turn left\r\n");
      out.write("						in a red signal only when there is a sign to do so. While turning,\r\n");
      out.write("						yield the right of way to pedestrians and vehicles coming from\r\n");
      out.write("						other directions.</p>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"col-3 \">\r\n");
      out.write("					<img alt=\"\" src=\"/DrivingSchoolArena/images/green.jpeg\"\r\n");
      out.write("						style=\"width: 120px;\">\r\n");
      out.write("					<h1 style=\"color: green;\">Green light</h1>\r\n");
      out.write("					<p>A Green signal at the intersection means to drive ahead.\r\n");
      out.write("						When a green traffic signal is displayed, oncoming traffic has\r\n");
      out.write("						been stopped and it is safe to drive forward. Even so, maintain\r\n");
      out.write("						caution while driving through a green signal as there may be\r\n");
      out.write("						pedestrians or cars jumping a red light.</p>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"col-3 \">\r\n");
      out.write("					<img alt=\"\" src=\"/DrivingSchoolArena/images/orange a.jpeg\"\r\n");
      out.write("						style=\"width: 120px;\">\r\n");
      out.write("					<h1 style=\"color: orange;\">Orange light</h1>\r\n");
      out.write("					<p>The AMBER (or YELLOW) light indicates to clear the road when\r\n");
      out.write("						the signal is changing from green to red. If, by mistake, caught\r\n");
      out.write("						in the amber signal in the middle of a large road crossing,\r\n");
      out.write("						continue with care and do not accelerate in panic. The signal\r\n");
      out.write("						light \"GREEN\" set you to go but be careful while on the start of\r\n");
      out.write("						move.</p>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			<hr style=\"border-width: 10px; color: red;\">\r\n");
      out.write("			<div class=\"row mt-4\">\r\n");
      out.write("				<div class=\"col-3\">\r\n");
      out.write("\r\n");
      out.write("					<img alt=\"\" src=\"/DrivingSchoolArena/images/stop.png\"\r\n");
      out.write("						style=\"width: 140px; float: left;\">\r\n");
      out.write("					<p>A stop sign means you must come to a full stop and wait\r\n");
      out.write("						until crossing vehicles and pedestrians have cleared before\r\n");
      out.write("						proceeding. Stop at the stop line if one is present. If necessary,\r\n");
      out.write("						you may then pull forward to the stop sign or the edge of the\r\n");
      out.write("						intersection and then proceed when it is safe to do so</p>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"col-3\">\r\n");
      out.write("\r\n");
      out.write("					<img alt=\"\" src=\"/DrivingSchoolArena/images/nouturn.png\"\r\n");
      out.write("						style=\"width: 120px; border-radius: 18%;\">\r\n");
      out.write("					<p>They are square with a black arrow that's crossed out in\r\n");
      out.write("						red. No U-turn signs are posted at intersections or along roads\r\n");
      out.write("						where the driver can't legally make a 180 degree turn. The sign is\r\n");
      out.write("						white with a black arrow that's crossed out in red.</p>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"col-3\">\r\n");
      out.write("\r\n");
      out.write("					<img alt=\"\" src=\"/DrivingSchoolArena/images/no parking.png\"\r\n");
      out.write("						style=\"width: 180px; border-radius: 50%;\">\r\n");
      out.write("					<p>This sign is used where parking and stopping is prohibited.\r\n");
      out.write("						Usually shown as a red cross inside a blue circle with a red ring\r\n");
      out.write("						in Europe and parts of Asia, and a 'E' in a red circle with a X\r\n");
      out.write("						through in South America.</p>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-3\">\r\n");
      out.write("\r\n");
      out.write("					<img alt=\"\" src=\"/DrivingSchoolArena/images/donotenter.png\"\r\n");
      out.write("						style=\"width: 180px; border-radius: 50%;\">\r\n");
      out.write("					<p>The do not enter sign is a regulatory sign. Drivers\r\n");
      out.write("						encountering a do not enter sign must not enter the road,\r\n");
      out.write("						off-ramp, exit ramp, or crossover where the sign is posted. Do not\r\n");
      out.write("						enter signs usually indicate opposing traffic, meaning that the\r\n");
      out.write("						traffic will be coming towards the driver.</p>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			<hr style=\"border-width: 10px; color: black;\">\r\n");
      out.write("			<div class=\"row mt-5\">\r\n");
      out.write("				<div class=\"col-2\"></div>\r\n");
      out.write("				<div class=\"col-6 text-center \">\r\n");
      out.write("					<h1>Road Signals</h1>\r\n");
      out.write("					<img alt=\"\" src=\"/DrivingSchoolArena/images/road images.png\"\r\n");
      out.write("						style=\"border-radius: 20px; width: 100%\">\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		<div style=\"clear: both\"></div>\r\n");
      out.write("\r\n");
      out.write("		<!--Main Navigation-->\r\n");
      out.write("		");
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
      out.write("\r\n");
      out.write("		");
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
