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
 <title>�α���</title>
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
 <br/><br/><center>
 <h3>ĸ��������� �ǽ� ��� ������ ȯ���մϴ�.<br/></h3>
 <div>
  <form name="form1" method="post" action="index.jsp" 
   onSubmit="return form1.userId.value!=''? return true: false;">
   �ǽ� ��п� ����� �г���(Nick Name)<br/>
   <input type="text" name="userId" />
   <input type="submit" value="�α���"/>
  </form>
 </div>
 </center>
 </body>
 </html>