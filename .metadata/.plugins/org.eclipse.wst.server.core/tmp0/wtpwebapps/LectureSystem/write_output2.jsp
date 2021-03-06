<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import ="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<style type='text/css'>
<!--
	a:link {font-family:"";color:black; text-decoration:none;}
	a:visited {font-family:"";color:black; text-decoration:none;}
	a:hover {font-family:"";color:black; text-decoration:underline;}
--!>
</style>

</head>
<body>
<%
	String num = request.getParameter("num");

	Class.forName("com.mysql.jdbc.Driver");
		
	String url = "jdbc:mysql://localhost/odbc";
		
	Connection conn = DriverManager.getConnection(url, "root", "1234");
		
	PreparedStatement pstmt = null;
	ResultSet rs = null;
		
	try{	
		String strSQL = "SELECT * FROM write2 where num = ?";
		pstmt = conn.prepareStatement(strSQL);
		pstmt.setInt(1, Integer.parseInt(num));
		
		rs = pstmt.executeQuery();
		rs.next();
		
		String name = rs.getString("name");
		String title = rs.getString("title");
		String contents = rs.getString("contents").trim();
		String writedate = rs.getString("writedate");
		int readcount = rs.getInt("readcount");
%>
	<center><font size='3'><b>자료공유</b></font></center>
	
	<table border='0' width='600' cellpadding='0' cellspacing='0'>
		<tr>
			<td><hr size='1' noshade>
			</td>
		</tr>
	</table>
	
	<table border='0' width='600'>
		<tr>
			<td align='left'>
				<font size='2'> 작성자 : <%=name %></font>
			</td>
			<td align='right'>
				<font size='2'> 작성일 : <%=writedate %></font>
			</td>
		</tr>
	</table>

	<table border='0' cellspacing=3 cellpadding=3 width='600'>
		<tr bgcolor='cccccc'>
			<td align='center'>
				<font size='3'><b><%=title %></b></font>
			</td>
		</tr>			
	</table>
	
	<table border='0' cellspacing=5 cellpadding=10 width='600'>
		<tr bgcolor='ededed'>
			<td><font size='3' color=''><%=contents %></font>
			</td>
		</tr>
	</table>
	
	<table border='0' width='600'>
		<tr>
			<td align='right'>
				<font size='2'><br><font size='2'></font>
			</font></td>
		</tr>
	</table>
	
	<table border='0' width='600' cellpadding='0' cellspacing='0'>
		<tr>
			<td><hr size='1' noshade>
			</td>
		</tr>
	</table>
	
	<table border='0' width='600'>
		<tr>
			<td align='right'>
				<a href='write2.jsp'>[글쓰기]</a>
			</td>
		</tr>
	</table>
	
	<%
		strSQL = "UPDATE write2 SET readcount=readcount+readcount+1 where num = ?";
		pstmt = conn.prepareStatement(strSQL);
		pstmt.setInt(1, Integer.parseInt(num));
		pstmt.executeUpdate();
	
		
	}catch(SQLException e){
		out.print("SQL에러 " + e.toString());
	}catch(Exception ex) {
		out.print("JSP에러 " + ex.toString());
	}finally {
		rs.close();
		pstmt.close();
		conn.close();
	}
%>

</body>
</html>