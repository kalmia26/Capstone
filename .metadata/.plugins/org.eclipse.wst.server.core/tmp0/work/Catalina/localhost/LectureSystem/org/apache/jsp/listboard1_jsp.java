/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M9
 * Generated at: 2017-05-10 04:52:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class listboard1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      response.setContentType("text/html; charset=EUC-KR");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<META http-equiv=\"content-Type\" content=\"text/html; charset=euc-kr\">\r\n");
      out.write("<style type = 'text/css'>\r\n");
      out.write("<!--\r\n");
      out.write("\ta:link\t{font-family:\"\"; color:black; text-decoration:none;}\r\n");
      out.write("\ta:visited\t{font-family:\"\"; color:black; text-decoration:none;}\r\n");
      out.write("\ta:hover\t{font-family:\"\"; color:black; text-decoration:underline;}\r\n");
      out.write("--!>\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">  \r\n");
      out.write("<!--  \r\n");
      out.write("function openWin(){  \r\n");
      out.write("    window.open(\"write1.jsp\", \"글쓰기\", \"width=800, height=700, toolbar=no, menubar=no, scrollbars=no, resizable=yes\" );  \r\n");
      out.write("}  \r\n");
      out.write("//-->  \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("\t<tr height=\"5\"><td width=\"5\"></td></tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"200\">자료공유</td>\r\n");
      out.write("\t\t<td width=\"100\">작성자</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<tr height=\"1\" bgcolor=\"#000000\">\r\n");
      out.write("\t\t<td colspan=\"6\"></td></tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");

	try{
		Class.forName("com.mysql.jdbc.Driver");
		

		String url = "jdbc:mysql://localhost/odbc";
		
		Connection conn = DriverManager.getConnection(url, "root", "1234");
		
		Statement stmt = conn.createStatement();
		
		String strSQL = "SELECT * FROM write1 ORDER BY num DESC";
		ResultSet rs = stmt.executeQuery(strSQL);
		
		while(rs.next()) {
			int num = rs.getInt("num");
			String name = rs.getString("name");
			String title = rs.getString("title");		

      out.write("\r\n");
      out.write("\t<tr bgcolor='ededed'>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<td align=left>\r\n");
      out.write("\t\t\t<a href=\"write_output1.jsp?num=");
      out.print(num );
      out.write("\">\r\n");
      out.write("\t\t\t<font size='2' color='black'>");
      out.print(title );
      out.write("</font></a>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td align=center>\r\n");
      out.write("\t\t\t<a href=\"write_output1.jsp?num=");
      out.print(num );
      out.write("\">\r\n");
      out.write("\t\t\t<font size='2' color='black'>");
      out.print(name );
      out.write("</font></a>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");


			
		}
		
	}catch(SQLException e) {
		
	}


      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <div style=\"position:absolute; right:0px; bottom:0px;\">\r\n");
      out.write("<table>\r\n");
      out.write("\r\n");
      out.write("\t<tr height=\"1\" bgcolor=\"#82B5DF\">\r\n");
      out.write("\t\t<td colspan=\"6\" width=\"752\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t  <tr align=\"right\">\r\n");
      out.write("\r\n");
      out.write("   <td>\r\n");
      out.write("   \r\n");
      out.write("      <a href=\"#\" onClick=\"javascript:openWin();\">글쓰기</a>  \r\n");
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("\t\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr height=\"1\" bgcolor=\"#82B5DF\">\r\n");
      out.write("\t\t<td colspan=\"6\" width=\"752\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write(" </table>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("  <tr><td colspan=\"4\" height=\"5\"></td></tr>\r\n");
      out.write("  <tr align=\"right\">\r\n");
      out.write("\r\n");
      out.write("   <td>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"selectMove.jsp\" method=\"post\" >\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<select name=\"List\">\r\n");
      out.write("    \t  <option value=\"1\">질문게시판</option>\r\n");
      out.write("          <option value=\"2\">자료공유게시판</option>\r\n");
      out.write("          <option value=\"3\">과제게시판</option>\r\n");
      out.write("          <option value=\"4\">설정</option>\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<input type=\"submit\" value=\"이동\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</td>\r\n");
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write(" </div>\r\n");
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
