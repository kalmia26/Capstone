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
	String List = request.getParameter("List");

	switch(List) {
	case "1" :
		%> <jsp:forward page="chat_client.html" /><%
		break;
		
	case "2" :
		%> <jsp:forward page="List2.jsp" /><%
		break;
		
	case "3" :
		%> <jsp:forward page="List3.jsp" /><%
		break;
		
	case "4" :
		%> <jsp:forward page="ListSet.jsp" /><%
		break;
	}

%>

</body>
</html>