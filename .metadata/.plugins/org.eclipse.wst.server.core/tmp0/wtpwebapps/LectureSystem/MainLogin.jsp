<%@ page language="java" contentType="text/html; charset=EUC-KR"
     pageEncoding="EUC-KR"%>
 <%
  request.setCharacterEncoding("euc-kr");
  String userId = request.getParameter("userId");
  if(userId!=null && !userId.equals("")){
   session.setAttribute("userId", userId);
   response.sendRedirect("chat_client.html");
  }
 %>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
 <title>로그인</title>
 <style>
  div{border:1px solid blue; 
   padding: 20px 20px 20px; text-align: center;
   vertical-align:middle;
   width:300px; height:100px;
   font-family: cursive;
  }
 </style>
 </head>
<body>
<form name="form1" method="post" action="FramesetPage.jsp" onSubmit="return form1.userId.value!=''? return true: false;">
	<table>
		<tr>
			<td> 아이디 : </td>
			<td> <input type="text" name="userId"> </td>
		</tr>	
		<tr>
			<td> 비밀번호 : </td>
			<td> <input type="password" name="_pw">  </td>
		</tr>	
		<tr>
			<td> 선택  : </td>
			<td><input type="radio" id='1' name="_name" value="n_open"> 성명
			<input type="radio" id='2' name="_name" value="n_close"> 익명 </td>
		</tr>
	</table>
	<input type="submit" value="로그인">
	<input type="reset" value="취소">
</form>


  
</body>
</html>