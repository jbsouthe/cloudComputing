/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.81
 * Generated at: 2017-09-10 20:45:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class NewRobot_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/includes/header.jsp", Long.valueOf(1505054080000L));
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');

	ResultSet resultset = null;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>New Robot</title>\n");
      out.write("<!-- Bootstrap Core CSS - Uses Bootswatch Flatly Theme: http://bootswatch.com/flatly/ -->\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom CSS -->\n");
      out.write("<link href=\"css/freelancer.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom Fonts -->\n");
      out.write("<link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\"\n");
      out.write("\ttype=\"text/css\">\n");
      out.write("<!--  <link\n");
      out.write("\thref='https://fonts.googleapis.com/css?family=Righteous|Fredoka+One'\n");
      out.write("\trel='stylesheet' type='text/css'>-->\n");
      out.write("\n");
      out.write("<link\n");
      out.write("\thref=\"http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\"\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<style>\n");
      out.write("        #RobotCode { \n");
      out.write("                position: absolute;\n");
      out.write("                top: 200px;\n");
      out.write("                right: 0;\n");
      out.write("                bottom: 0;\n");
      out.write("                left: 0;\n");
      out.write("            }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("<link\n");
      out.write("\thref=\"//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<link href=\"css/style_header.css\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<script\n");
      out.write("\tsrc=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<script\n");
      out.write("\tsrc=\"http://netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Bootstrap Core CSS - Uses Bootswatch Flatly Theme: http://bootswatch.com/flatly/ -->\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom CSS -->\n");
      out.write("<link href=\"css/freelancer.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom Fonts -->\n");
      out.write("<link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\"\n");
      out.write("\ttype=\"text/css\">\n");
      out.write("<link\n");
      out.write("\thref='https://fonts.googleapis.com/css?family=Righteous|Fredoka+One'\n");
      out.write("\trel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("<link\n");
      out.write("\thref=\"http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\"\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("<script src=\"http://code.jquery.com/jquery.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body id=\"page-top\" class=\"index\">\n");
      out.write("\t<!-- Navigation -->\n");
      out.write("\t<nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t<div class=\"navbar-header page-scroll\">\n");
      out.write("\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\tdata-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"welcome.jsp\">Robocode</a>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\"\n");
      out.write("\t\t\tid=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t<li class=\"hidden\"><a href=\"#page-top\"></a></li>\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a href=\"#new\">New</a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"NewRobot.jsp\">Robot</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#CUser\">User</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#CDomain\">Domain</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#CRole\">Role</a></li>\n");
      out.write("\t\t\t\t\t</ul></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a href=\"#edit\">Edit</a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"Edit_Robot3.jsp\">Robot</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#EUser\">User</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#EDomain\">Domain</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#ERole\">Role</a></li>\n");
      out.write("\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a href=\"#view\">View</a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"ViewRobot.jsp\">Robot</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#VUser\">User</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#VDomain\">Domain</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#VRole\">Role</a></li>\n");
      out.write("\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t<li class=\"page-scroll\"><a href=\"PlayBattle.jsp\">Play Battle!</a></li>\n");
      out.write("\t\t\t\t<li class=\"page-scroll\"><a href=\"#view\">Settings</a></li>\n");
      out.write("\t\t\t\t<li class=\"page-scroll\"><a href=\"#view\"><img\n");
      out.write("\t\t\t\t\t\tclass=\"img-responsive\" src=\"img/power button.png\" alt=\"\"\n");
      out.write("\t\t\t\t\t\tALIGN=\"RIGHT\" hspace=\"1\">Logout</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /.navbar-collapse -->\n");
      out.write("\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\t</body>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("function submit() {\n");
      out.write("\t$(\"#role\").submit();\n");
      out.write("}\n");
      out.write("\n");
      out.write("function submit1() {\n");
      out.write("\t$(\"#heirarchy\").submit();\n");
      out.write("}\n");
      out.write("function submit2() {\n");
      out.write("\t$(\"#heirarchyc\").submit();\n");
      out.write("}\n");
      out.write("function submit3() {\n");
      out.write("\t$(\"#editrole\").submit();\n");
      out.write("}\n");
      out.write("function submit4() {\n");
      out.write("\t$(\"#heirarchyEdit\").submit();\n");
      out.write("}\n");
      out.write("function submit5() {\n");
      out.write("\t$(\"#packageEdit\").submit();\n");
      out.write("}\n");
      out.write("function submit6() {\n");
      out.write("\t$(\"#maph\").submit();\n");
      out.write("}\n");
      out.write("function submit8() {\n");
      out.write("\t$(\"#Ppermissionedit\").submit();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<!--  <div class=\"container\">\n");
      out.write("\t\t<div id=\"page-wrapper\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t\t<h1 class=\"page-header\">\n");
      out.write("\t\t\t\t\t<!--  <i class=\"fa fa-file-text\"></i>\tCreate a New Robot,\n");
      out.write("\t\t\t\t\t\t");
      out.print(session.getAttribute("userx"));
      out.write("</h1>\n");
      out.write("\t\t\t\t\t\t</h1>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /.col-lg-12 \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div> -->\n");
      out.write("\t\t\t<!-- /.row -->\n");
      out.write("\t\t\t<br><br><br><br>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-6\">\n");
      out.write("<!--  <form method=\"post\" action=\"editservlet\"> -->\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t");

							Set<String> list_of_tenants = new HashSet<String>();
							Set<String> list_of_domains = new HashSet<String>();
							Set<String> list_of_robots = new HashSet<String>();
							HashMap<String, List<String>> map = new HashMap<String, List<String>>();
							HashMap<String, List<String>> domain_robot_map = new HashMap<String, List<String>>();							
								try {
									String connectionURL = "jdbc:mysql://localhost:3306/robocode";
									Class.forName("com.mysql.jdbc.Driver").newInstance();
									Connection connection = DriverManager.getConnection(connectionURL, "root",
											"root");

									Statement statement = connection.createStatement();
									String selectString="SELECT userID, packageID, robotID from robot";
									resultset = statement
											.executeQuery(selectString);
									
											
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t\tfunction getDomains() {\n");
      out.write("\n");
      out.write("\t\t\tvar x = document.getElementById(\"domain_name\").value;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"GetrobotDomain\",\n");
      out.write("\t\t\t\tdata : \"tenant_name=\" + x + \"\",\n");
      out.write("\t\t\t\ttype : 'POST',\n");
      out.write("\t\t\t\tasync : false,\n");
      out.write("\t\t\t\tsuccess : function(html) {\n");
      out.write("\t\t\t\t\tconsole.log(\"html:\" + html);\n");
      out.write("\t\t\t\t\t$(\"#package\").html(html);\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\terror : function(html) {\n");
      out.write("\t\t\t\t\tconsole.log(\"error html:\" + html);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\t\n");
      out.write("\t\t</script>\t<br><br><h1>New Robot</h1><br>\n");
      out.write("\t\t&nbsp;&nbsp;&nbsp;&nbsp;<label>Select User</label>\n");
      out.write("\t\t\t\t\t\t<select name=\"domain_name\" id=\"domain_name\" class=\"form-control\" onchange=\"getDomains()\"\n");
      out.write("\t\t\t\t\t\t\t>\n");
      out.write("\t\t\t\t\t\t\t<option>Select User</option>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");

									while (resultset.next()) {
										list_of_tenants.add(resultset.getString(1));
										list_of_domains.add(resultset.getString(2));
										list_of_robots.add(resultset.getString(3));
										String value1 = resultset.getString(1);
										String value2 = resultset.getString(2);
										String value3 = resultset.getString(3);
										List<String> value = map.get(value1);
										if (value == null) {
											map.put(value1, new ArrayList<String>());
											map.get(value1).add(value2);
										} else {
											value = map.get(value1);
											if (!value.contains(value2)) {
												map.get(value1).add(value2);
											}

										}
										value = domain_robot_map.get(value2);
										if (value == null) {
											domain_robot_map.put(value2, new ArrayList<String>());
											domain_robot_map.get(value2).add(value3);
										} else {
											value = domain_robot_map.get(value2);
											if (!value.contains(value3)) {
												domain_robot_map.get(value2).add(value3);
											}

										}
									}
								
								Iterator iterator = list_of_tenants.iterator();
								while (iterator.hasNext()) {
									String key = (String) iterator.next();	
									//System.out.println(key);
								
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<option value=\"");
      out.print(key);
      out.write('"');
      out.write('>');
      out.print(key);
      out.write("</option>\n");
      out.write("\t\t\t\t\t\t\t");

								}
							session.setAttribute("tenantMap", map);
							session.setAttribute("DomainMap", domain_robot_map);
							session.setAttribute("userx", "User");
								
      out.write("\n");
      out.write("\t\t\t\t\t\t</select> <br /> \n");
      out.write("\t\t\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\tfunction getRobots() {\n");
      out.write("\n");
      out.write("\t\t\tvar x = document.getElementById(\"package\").value;\n");
      out.write("\t\t\t//alert(\"x value:\"+x);\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"Getrobots\",\n");
      out.write("\t\t\t\tdata : \"domain_name=\" + x + \"\",\n");
      out.write("\t\t\t\ttype : 'POST',\n");
      out.write("\t\t\t\tasync : false,\n");
      out.write("\t\t\t\tsuccess : function(html) {\n");
      out.write("\t\t\t\t\tconsole.log(\"html:\" + html);\n");
      out.write("\t\t\t\t\t$(\"#displayrobots\").html(html);\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\terror : function(html) {\n");
      out.write("\t\t\t\t\tconsole.log(\"error html:\" + html);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\t\n");
      out.write("\t\t</script>\t\t&nbsp;&nbsp;&nbsp;&nbsp;<label>Select Package</label>\n");
      out.write("\t\t\t\t\t\t<select name=\"package\" id=\"package\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\tonchange=\"getRobots()\" >\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<option>Select Package</option>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</select> <br /> \n");
      out.write("\t\t\t\t\t\t\t");
} catch (Exception e) {
									out.println("wrong entry" + e);
								}
							
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;<label>Enter Robot Name. Example: MyFirstRobot. Must not contain spaces.</label>\n");
      out.write("\t\t\t\t\t    <br>\n");
      out.write("\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;<label> Robot Name: </label> &nbsp;&nbsp;&nbsp;&nbsp;<input width=\"200px\" name=\"roboName\" id=\"robo_name\"\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\" class=\"fa-la\"/>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t function NewRobot(){\n");
      out.write("\t\t\t\t\t\tvar robotPackage=document.getElementById(\"package\").value;\n");
      out.write("\t\t\t        \t var name = document.getElementById(\"robo_name\").value;\n");
      out.write("\t\t\t        \t var user = document.getElementById(\"domain_name\").value;\n");
      out.write("\t\t\t            $.ajax({\n");
      out.write("\t\t\t                url: 'newRobot',\n");
      out.write("\t\t\t                type: 'POST',\n");
      out.write("\t\t\t                data: \"RobotInfo=\"+robotPackage+\"-\"+name+\"-\"+user,\n");
      out.write("\t\t\t                async : false,\n");
      out.write("\t\t\t                success : function(html) {\n");
      out.write("\t\t\t    \t\t\t\tconsole.log(html);\n");
      out.write("\t\t\t    \t\t\t\twindow.location.replace(\"NewRobot2.jsp\"); \n");
      out.write("\t\t\t                }\n");
      out.write("\t\t\t            });  \n");
      out.write("\t\t\t        \tevent.preventDefault();\n");
      out.write("\t\t\t        \t}\n");
      out.write("\t\t\t\t </script>\n");
      out.write("\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-success\" id=\"create\" onclick=\"NewRobot();\">Next</button>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /.col-lg-6 (nested) -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /.row (nested) -->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /.panel-body -->\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
