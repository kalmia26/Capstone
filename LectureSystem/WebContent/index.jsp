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
 <br/><br/><center>
 <h3>캡스톤디자인 실습 토론 참여를 환영합니다.<br/></h3>
 <div>
  <form name="form1" method="post" action="index.jsp" 
   onSubmit="return form1.userId.value!=''? return true: false;">
   실습 토론에 사용할 닉네임(Nick Name)<br/>
   <input type="text" name="userId" />
   <input type="submit" value="로그인"/>
  </form>
 </div>
 </center>
 </body>
 </html>