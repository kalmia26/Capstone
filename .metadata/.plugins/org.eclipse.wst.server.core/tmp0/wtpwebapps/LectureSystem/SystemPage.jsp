<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>확인</h1>
	ID : <%= request.getParameter("_id") %> <br/>
	PW : <%= request.getParameter("_pw") %> <br/>
	공개여부 : <%= request.getParameter("_name") %> <br/>
	
</body>
</html>