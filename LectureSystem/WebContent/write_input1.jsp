<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%

	String name = request.getParameter("name");
	String pass = request.getParameter("pass");
	String title = request.getParameter("title");
	String contents = request.getParameter("contents");
	
	
	
	try{
		
	Class.forName("com.mysql.jdbc.Driver");
	

	String url = "jdbc:mysql://localhost/odbc";
	
	Connection conn = DriverManager.getConnection(url, "root", "1234");
	

	PreparedStatement pstmt = null;
	
	Calendar dateIn = Calendar.getInstance();
	String indate = Integer.toString(dateIn.get(Calendar.YEAR)) + "-";
	indate = indate + Integer.toString(dateIn.get(Calendar.MONTH) + 1) + "-";
	indate = indate + Integer.toString(dateIn.get(Calendar.DATE)) + " ";
	indate = indate + Integer.toString(dateIn.get(Calendar.HOUR_OF_DAY)) + ":";
	indate = indate + Integer.toString(dateIn.get(Calendar.MINUTE)) + ":";
	indate = indate + Integer.toString(dateIn.get(Calendar.SECOND));
	
	String strSQL = "INSERT INTO write1(name, pass, title, contents, writedate, readcount)";
	strSQL = strSQL + "VALUES (?, ?, ?, ?, ?, ?)";
	pstmt = conn.prepareStatement(strSQL);
	pstmt.setString(1, name);
	pstmt.setString(2, pass);
	pstmt.setString(3, title);
	pstmt.setString(4, contents);
	pstmt.setString(5, indate);
	pstmt.setInt(6, 0);
	pstmt.executeUpdate();
	
	pstmt.close();
	conn.close();
	
	}catch(SQLException ex) {
		
	}
	
%>

<script>

	window.close();
</script>

</body>
</html>