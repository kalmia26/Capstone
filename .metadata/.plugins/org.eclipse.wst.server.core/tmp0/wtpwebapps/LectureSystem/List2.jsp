<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<META http-equiv="content-Type" content="text/html; charset=euc-kr">
<style type = 'text/css'>
<!--
	a:link	{font-family:""; color:black; text-decoration:none;}
	a:visited	{font-family:""; color:black; text-decoration:none;}
	a:hover	{font-family:""; color:black; text-decoration:underline;}
--!>
</style>

<script language="javascript">  
<!--  
function openWin(){  
    window.open("write1.jsp", "글쓰기", "width=800, height=700, toolbar=no, menubar=no, scrollbars=no, resizable=yes" );
}  
//-->  
</script>
</head>
<body>
<table width="100%" cellpadding="0" cellspacing="0" border="0">
	<tr height="5"><td width="5"></td></tr>
	
	<tr>
		<td width="200">자료공유</td>
		<td width="100">작성자</td>
	</tr>
	
		<tr height="1" bgcolor="#000000">
		<td colspan="6"></td></tr>


<%
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
%>
	<tr bgcolor='ededed'>
		
		<td align=left>
			<a href="#" onClick="window.open('write_output1.jsp?num=<%=num %>','게시물내용출력','width=800, height=700, toolbar=no, menubar=no, scrollbars=no, resizable=yes');return false;">
			<font size='2' color='black'><%=name %></font></a>
		</td>
		<td align=center>			
			<a href="#" onClick="window.open('write_output1.jsp?num=<%=num %>','게시물내용출력','width=800, height=700, toolbar=no, menubar=no, scrollbars=no, resizable=yes');return false;">
			<font size='2' color='black'><%=name %></font></a>
		</td>
	</tr>

<%

			
		}
		
	}catch(SQLException e) {
		
	}

%>

</table>



 <div style="position:absolute; right:0px; bottom:0px;">
<table>

	<tr height="1" bgcolor="#82B5DF">
		<td colspan="6" width="752"></td>
	</tr>
	  <tr align="right">

   <td>
   
      <a href="#" onClick="javascript:openWin();">글쓰기</a>  

	</td>
	
	</tr>
	<tr height="1" bgcolor="#82B5DF">
		<td colspan="6" width="752"></td>
	</tr>
 </table>
 


<table width="100%" cellpadding="0" cellspacing="0" border="0">
  <tr><td colspan="4" height="5"></td></tr>
  <tr align="right">

   <td>
   


<form action="selectMove.jsp" method="post" >
		
		<select name="List">
    	  <option value="1">질문게시판</option>
          <option value="2">자료공유게시판</option>
          <option value="3">과제게시판</option>
          <option value="4">설정</option>
		</select>
		
		<input type="submit" value="이동">
		
		</form>
	</td>

  </tr>
	</table>
 </div>
</body>
</html>