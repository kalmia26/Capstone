/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M9
 * Generated at: 2017-05-24 06:11:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class member_005finput_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("\ta:link\t{font-family:\"\"; color:black; text-decoration:none;}\r\n");
      out.write("\ta:visited\t{font-family:\"\"; color:black; text-decoration:none;}\r\n");
      out.write("\ta:hover\t{font-family:\"\"; color:black; text-decoration:underline;}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script language=\"JavaScript\">\r\n");
      out.write("function Check() {\r\n");
      out.write("\tif(Member_input.id.value.length < 1) {\r\n");
      out.write("\t\talert(\"아이디를 입력하세요.\");\r\n");
      out.write("\t\tMember_input.id.foucs();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(Member_input.pass.value.length < 1) {\r\n");
      out.write("\t\talert(\"비밀번호를 입력하세요.\");\r\n");
      out.write("\t\tMember_input.pass.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(Member_input.name.value.length < 1) {\r\n");
      out.write("\t\talert(\"이름을 입력하세요.\");\r\n");
      out.write("\t\tMember_input.name.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(Member_input.juminnum1.value.length < 1) {\r\n");
      out.write("\t\talert(\"주민등록번호를 입력하세요.\");\r\n");
      out.write("\t\tMember_input.juminnum1.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(Member_input.juminnum1.value.length != 6) {\r\n");
      out.write("\t\talert(\"주민등록번호 앞자리는 6자리 입니다.\");\r\n");
      out.write("\t\tMember_input.juminnum1.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tfor (var i=0; i<member_input.juminnum1.value.lenght; i++) {\r\n");
      out.write("\t\tif(member_input.juminnum1.value.charAt(i) < \"0\" || member_input.juminnum1.value.charAt(i) > \"9\") {\r\n");
      out.write("\t\t\talert(\"주민등록번호는 숫자만 가능합니다.\");\r\n");
      out.write("\t\t\tmember_input.juminnum1.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tif(Member_input.juminnum2.value.length < 1) {\r\n");
      out.write("\t\talert(\"주민등록번호를 입력하세요.\");\r\n");
      out.write("\t\tMember_input.juminnum2.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(Member_input.juminnum2.value.length != 7) {\r\n");
      out.write("\t\talert(\"주민등록번호 뒷자리는 7자리 입니다.\");\r\n");
      out.write("\t\tMember_input.juminnum2.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tfor (var i=0; i<member_input.juminnum2.value.lenght; i++) {\r\n");
      out.write("\t\tif(member_input.juminnum2.value.charAt(i) < \"0\" || member_input.juminnum2.value.charAt(i) > \"9\") {\r\n");
      out.write("\t\t\talert(\"주민등록번호는 숫자만 가능합니다.\");\r\n");
      out.write("\t\t\tmember_input.juminnum2.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tvar sum,a,b,c,d,e,f,g,h,i,j,k,l,m;\r\n");
      out.write("\t\r\n");
      out.write("\ta = praseInt(member_input.juminnum1.value.charAt(0));\r\n");
      out.write("\tb = praseInt(member_input.juminnum1.value.charAt(1));\r\n");
      out.write("\tc = praseInt(member_input.juminnum1.value.charAt(2));\r\n");
      out.write("\td = praseInt(member_input.juminnum1.value.charAt(3));\r\n");
      out.write("\te = praseInt(member_input.juminnum1.value.charAt(4));\r\n");
      out.write("\tf = praseInt(member_input.juminnum1.value.charAt(5));\r\n");
      out.write("\tg = praseInt(member_input.juminnum2.value.charAt(0));\r\n");
      out.write("\th = praseInt(member_input.juminnum2.value.charAt(1));\r\n");
      out.write("\ti = praseInt(member_input.juminnum2.value.charAt(2));\r\n");
      out.write("\tj = praseInt(member_input.juminnum2.value.charAt(3));\r\n");
      out.write("\tk = praseInt(member_input.juminnum2.value.charAt(4));\r\n");
      out.write("\tl = praseInt(member_input.juminnum2.value.charAt(5));\r\n");
      out.write("\tm = praseInt(member_input.juminnum2.value.charAt(6));\r\n");
      out.write("\t\r\n");
      out.write("\tsum = a*2 + b*3 + c*4 + d*5 + e*6 + f*7 + g*8 + h*9 + i*2 + j*3 + k*4 + l*5;\r\n");
      out.write("\t\r\n");
      out.write("\tvar namuji = sum % 11;\r\n");
      out.write("\tvar humsa = 11 - namuji;\r\n");
      out.write("\tvar check_no = gumsa % 10;\r\n");
      out.write("\t\r\n");
      out.write("\tif(check_no != m) {\r\n");
      out.write("\t\talert(\"올바른 주민등록번호가 아닙니다.\");\r\n");
      out.write("\t\tmember_input.juminnum2.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tMember.submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function Check_focus() {\r\n");
      out.write("\tvar strfocus1 = member_input.juminnum1.value.length;\r\n");
      out.write("\tif(strfocus1 == 6)\r\n");
      out.write("\t\tmember_input.juminnum2.focus();\r\n");
      out.write("}\r\n");
      out.write("function check_id() {\r\n");
      out.write("\tbrowsing_window = window.open(\"checkid.jsp?id=\"+member_input.id.value,\r\n");
      out.write("\t\t\t\"_idcheck\",\"height=200, wight=300, menubar=no, directories=no, resizable=no, status=no, scrollbars=yes\");\r\n");
      out.write("\tbrowsing_window.focus();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<center><font size='3'><b>회원 가입</b></font>\r\n");
      out.write("\t<table border='0' width='600' cellpadding='0' cellspacing='0'>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><hr size='1' noshade>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t<form name=\"member_input\" method=\"post\" action=\"member_output.jsp\">\r\n");
      out.write("\t\t<table border='2' cellspacing='0' cellpadding='5' align=center>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td bgcolor='cccccc' align='center'>\r\n");
      out.write("\t\t\t\t<font size='2'>아 이 디</font>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td bgcolor='cccccc'>\r\n");
      out.write("\t\t\t\t<input type=\"text\" maxlength=\"10\" size=\"10\" name=\"id\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" onclick=\"Check_id()\" value=\"ID 중복검사\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td bgcolor='cccccc' align='center'>\r\n");
      out.write("\t\t\t\t<font size='2'>비 밀 번 호</font>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td bgcolor='cccccc'>\r\n");
      out.write("\t\t\t\t<input type=\"password\" maxlength=\"10\" size=\"10\" name=\"pass\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td bgcolor='cccccc' align='center'>\r\n");
      out.write("\t\t\t\t<font size='2'>이 름</font>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td bgcolor='cccccc'>\r\n");
      out.write("\t\t\t\t<input type=\"text\" maxlength=\"10\" size=\"10\" name=\"name\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td bgcolor='cccccc' align='center'>\r\n");
      out.write("\t\t\t\t<font size='2'>주민등록번호</font>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td bgcolor='cccccc'>\r\n");
      out.write("\t\t\t\t<input type=\"text\" size=\"6\" maxlength=\"6\" name=\"juminnum1\" onkeypress=\"check_focus();\" >-\r\n");
      out.write("\t\t\t\t<input type=\"text\" size=\"7\" maxlength=\"7\" name=\"juminnum2\"> \r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td bgcolor='cccccc' align='center'>\r\n");
      out.write("\t\t\t\t<font size='2'>주 소</font>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td bgcolor='cccccc'>\r\n");
      out.write("\t\t\t\t<input type=\"text\" maxlength=\"50\" size=\"50\" name=\"address\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td bgcolor='cccccc' align='center'>\r\n");
      out.write("\t\t\t\t<font size='2'>연 락 처</font>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td bgcolor='cccccc'>\r\n");
      out.write("\t\t\t\t<input type=\"text\" maxlength=\"20\" size=\"20\" name=\"phone\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td bgcolor='cccccc' align='center'>\r\n");
      out.write("\t\t\t\t<font size='2'>이 메 일</font>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td bgcolor='cccccc'>\r\n");
      out.write("\t\t\t\t<input type=\"text\" maxlength=\"50\" size=\"50\" name=\"email\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<table border=\"0\" width=\"600\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><hr size='1' noshade>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan='2' align=\"center\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" onclick=\"check()\" value=\"회원가입\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("</center>\r\n");
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