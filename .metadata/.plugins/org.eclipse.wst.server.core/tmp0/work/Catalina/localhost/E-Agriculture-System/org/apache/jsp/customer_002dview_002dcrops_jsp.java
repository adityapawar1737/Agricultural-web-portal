/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.8
 * Generated at: 2022-04-11 03:27:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.connection.*;
import java.sql.*;

public final class customer_002dview_002dcrops_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"zxx\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<title>Agricultural Web Portal</title>\r\n");
      out.write("<!-- google fonts -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"//fonts.googleapis.com/css2?family=Poppins:wght@300;600;700&display=swap\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/style-starter.css\">\r\n");
      out.write("<!-- <link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"></script> -->\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");

		if (session.getAttribute("uname") != null && session.getAttribute("uname") != "") {
	
      out.write("\r\n");
      out.write("\t<!--header-->\r\n");
      out.write("\t<header id=\"site-header\" class=\"fixed-top\">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "customer-side-header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<!-- //header -->\r\n");
      out.write("\t<!-- about breadcrumb -->\r\n");
      out.write("\t<!-- <section class=\"w3l-about-breadcrumb text-left\">\r\n");
      out.write("\t\t<div class=\"breadcrumb-bg breadcrumb-bg-about py-sm-5 py-4\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<h2 class=\"title\">View Crops</h2>\r\n");
      out.write("\t\t\t\t<ul class=\"breadcrumbs-custom-path mt-2\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#url\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"active\"><span class=\"fa fa-arrow-right mx-2\"\r\n");
      out.write("\t\t\t\t\t\taria-hidden=\"true\"></span>All Crops</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section> --><br><br>\r\n");
      out.write("\t<!-- //about breadcrumb -->\r\n");
      out.write("\t<!-- /contact-->\r\n");
      out.write("\t<div class=\"contact-form py-5\" id=\"contact\">\r\n");
      out.write("\t\t<div class=\"container py-lg-5 py-md-4\">\r\n");
      out.write("\t\t\t<div class=\"contacts12-main mb-5\">\r\n");
      out.write("\t\t\t<h1>View Crops</h1>\r\n");
      out.write("\t\t\t\t<form action=\"customer-view-crops.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type='text' class=\"form-control\" id=\"crop\" name=\"crop\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Crop Name\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" class=\"btn btn-primary\" value=\"Search Crops\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t");

					String cropName = request.getParameter("crop");
				if (cropName != null) {
					ResultSet resultCrop = DatabaseConnection
					.getResultFromSqlQuery("select * from tblcrops where crop_name like '%" + cropName + "%' ");
					if (resultCrop.next()) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"form-row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t<image src=\"uploads/");
      out.print(resultCrop.getString("crop_image_name"));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width:130px;height:100px;\"></image>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<h3>");
      out.print(resultCrop.getString("crop_name"));
      out.write("</h3>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<label style='color: #33b5e5;'>");
      out.print(resultCrop.getString("month"));
      out.write("</label>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<p>");
      out.print(resultCrop.getString("description"));
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t");

					}
				} else {
				ResultSet resultset = DatabaseConnection.getResultFromSqlQuery("select * from tblcrops");
				while (resultset.next()) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"form-row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t<image src=\"uploads/");
      out.print(resultset.getString("crop_image_name"));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width:130px;height:100px;\"></image>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<h3>");
      out.print(resultset.getString("crop_name"));
      out.write("</h3>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<label style='color: #33b5e5;'>");
      out.print(resultset.getString("month"));
      out.write("</label>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<p>");
      out.print(resultset.getString("description"));
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t");

					}
				}
				
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!--/w3l-footer-29-main-->\r\n");
      out.write("\t<section class=\"w3l-footer-29-main\">\r\n");
      out.write("\t\t<div class=\"footer-29 py-5\">\r\n");
      out.write("\t\t\t<div class=\"container py-lg-4\">\r\n");
      out.write("\t\t\t\t<div class=\"row footer-top-29\">\r\n");
      out.write("\t\t\t\t\t<div class=\"footer-list-29 col-lg-4\">\r\n");
      out.write("\t\t\t\t\t\t<h6 class=\"footer-title-29\">About Us</h6>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"pr-lg-5\">The Agricultural web portal to override the\r\n");
      out.write("\t\t\t\t\t\t\tproblems prevailing in the practicing manual system. This\r\n");
      out.write("\t\t\t\t\t\t\tsoftware is supported to eliminate and in some cases reduce the\r\n");
      out.write("\t\t\t\t\t\t\thardships faced by this existing system.</p>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"main-social-footer-29 mt-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#facebook\" class=\"facebook\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-facebook\"></span></a> <a href=\"#twitter\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"twitter\"><span class=\"fa fa-twitter\"></span></a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"#instagram\" class=\"instagram\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-instagram\"></span></a> <a href=\"#linkedin\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"linkedin\"><span class=\"fa fa-linkedin\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\tclass=\"col-lg-4 col-md-6 col-sm-4 footer-list-29 footer-2 mt-lg-0 mt-5\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<h6 class=\"footer-title-29\">Useful Links</h6>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">Crops</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">Insecticides</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">Pesticides</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">Equipments</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">About us</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\tclass=\"col-lg-4 col-md-6 col-sm-8 footer-list-29 footer-1 mt-lg-0 mt-5\">\r\n");
      out.write("\t\t\t\t\t\t<h6 class=\"footer-title-29\">Contact Us</h6>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"fa fa-map-marker\"></span> Maharashtra, India\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\"><span class=\"fa fa-phone\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+(91)-0000000000</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\" class=\"mail\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"fa fa-envelope-open-o\"></span> agricultureinfo@mail.com</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<section class=\"w3l-footer-29-main w3l-copyright\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"bottom-copies\">\r\n");
      out.write("\t\t\t\t<p class=\"copy-footer-29 text-center\">© 2022 Agricultural\r\n");
      out.write("\t\t\t\t\tSystem. All rights reserved.</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- move top -->\r\n");
      out.write("\t\t<button onclick=\"topFunction()\" id=\"movetop\" title=\"Go to top\">\r\n");
      out.write("\t\t\t<span class=\"fa fa-angle-up\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\t// When the user scrolls down 20px from the top of the document, show the button\r\n");
      out.write("\t\t\twindow.onscroll = function() {\r\n");
      out.write("\t\t\t\tscrollFunction()\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction scrollFunction() {\r\n");
      out.write("\t\t\t\tif (document.body.scrollTop > 20\r\n");
      out.write("\t\t\t\t\t\t|| document.documentElement.scrollTop > 20) {\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"movetop\").style.display = \"block\";\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"movetop\").style.display = \"none\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t// When the user clicks on the button, scroll to the top of the document\r\n");
      out.write("\t\t\tfunction topFunction() {\r\n");
      out.write("\t\t\t\tdocument.body.scrollTop = 0;\r\n");
      out.write("\t\t\t\tdocument.documentElement.scrollTop = 0;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<!-- /move top -->\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<!-- //footer-29 block -->\r\n");
      out.write("\t<!-- disable body scroll which navbar is in active -->\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\t$('.navbar-toggler').click(function() {\r\n");
      out.write("\t\t\t\t$('body').toggleClass('noscroll');\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!-- disable body scroll which navbar is in active -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- Template JavaScript -->\r\n");
      out.write("\t<script src=\"assets/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/js/theme-change.js\"></script>\r\n");
      out.write("\t<!--/MENU-JS-->\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(window).on(\"scroll\", function() {\r\n");
      out.write("\t\t\tvar scroll = $(window).scrollTop();\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (scroll >= 80) {\r\n");
      out.write("\t\t\t\t$(\"#site-header\").addClass(\"nav-fixed\");\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$(\"#site-header\").removeClass(\"nav-fixed\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t//Main navigation Active Class Add Remove\r\n");
      out.write("\t\t$(\".navbar-toggler\").on(\"click\", function() {\r\n");
      out.write("\t\t\t$(\"header\").toggleClass(\"active\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(document).on(\"ready\", function() {\r\n");
      out.write("\t\t\tif ($(window).width() > 991) {\r\n");
      out.write("\t\t\t\t$(\"header\").removeClass(\"active\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$(window).on(\"resize\", function() {\r\n");
      out.write("\t\t\t\tif ($(window).width() > 991) {\r\n");
      out.write("\t\t\t\t\t$(\"header\").removeClass(\"active\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!--//MENU-JS-->\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t");

		} else {
		response.sendRedirect("customer-login.jsp");
	 }
	
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}