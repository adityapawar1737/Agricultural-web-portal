/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.8
 * Generated at: 2022-04-11 03:34:48 UTC
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

public final class view_002dcustomer_002dcrops_002dselling_002ddetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- google fonts -->\r\n");
      out.write("<!-- Template CSS -->\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Template CSS -->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<!--header-->\r\n");
      out.write("\t<header id=\"site-header\" class=\"fixed-top\">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "admin-side-header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<!-- //header -->\r\n");
      out.write("\t<!-- about breadcrumb -->\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row pad-botm\">\r\n");
      out.write("\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t<h4 class=\"header-line\">\r\n");
      out.write("\t\t\t\t\t<strong>View Customer Crop Details</strong>\r\n");
      out.write("\t\t\t\t</h4>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"panel panel-info shadow p-3 mb-5\">\r\n");
      out.write("\t\t\t<div class=\"panel-heading\">View Customer Crop Details</div>\r\n");
      out.write("\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t");

					ResultSet resultset = DatabaseConnection.getResultFromSqlQuery("select * from tblsellcrops where sell_id='"+ request.getParameter("sellId") + "' and admin_name='" + session.getAttribute("admin-name") + "'");
					if (resultset.next()) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<form action=\"AdminActionOnCustomerCrops\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"sellId\">Sell Id:</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"sellId\" name=\"sellId\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(resultset.getInt("sell_id"));
      out.write("\" readonly>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"cname\">Full Name:</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"cname\" name=\"cname\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(resultset.getString("customer_name"));
      out.write("\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"email\">Email Id:</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"email\" placeholder=\"Email Id\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"email\" value=\"");
      out.print(resultset.getString("email_id"));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\treadonly>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"mobile\">Mobile No:</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"mobile\" placeholder=\"Mobile No\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"mobile\" value=\"");
      out.print(resultset.getString("mobile_no"));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\trequired>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"address\">Address:</label>\r\n");
      out.write("\t\t\t\t\t\t\t<textarea class=\"form-control\" id=\"address\" name=\"address\">");
      out.print(resultset.getString("address"));
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"form-row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"cropName\">Crop Name:</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"cropName\" name=\"cropName\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(resultset.getString("crop_name"));
      out.write("\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"quantity\">Crop Quantity:</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"quantity\" name=\"quantity\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(resultset.getString("crop_quantity"));
      out.write("\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"cropDescription\">Crop Description:</label>\r\n");
      out.write("\t\t\t\t\t\t\t<textarea class=\"form-control\" id=\"cropDescription\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"cropDescription\">");
      out.print(resultset.getString("crop_description"));
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"buyerName\">Buyer Name:</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"buyerName\" name=\"buyerName\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(resultset.getString("admin_name"));
      out.write("\" readonly>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"cropDescription\">Action:</label> <select\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"status\" name=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>Accept Crop</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>Reject Crop</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"Take Action\" class=\"btn btn-primary\">\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "customer-side-footer.jsp", out, false);
      out.write("\r\n");
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
      out.write("\t<script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
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