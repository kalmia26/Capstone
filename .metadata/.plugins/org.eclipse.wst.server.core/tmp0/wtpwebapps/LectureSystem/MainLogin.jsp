<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="FramesetPage.jsp" method="post">
	<table>
		<tr>
			<td> ���̵� : </td>
			<td> <input type="text" name="_id"> </td>
		</tr>	
		<tr>
			<td> ��й�ȣ : </td>
			<td> <input type="password" name="_pw">  </td>
		</tr>	
		<tr>
			<td> ����  : </td>
			<td><input type="radio" id='1' name="_name" value="n_open"> ����
			<input type="radio" id='2' name="_name" value="n_close"> �͸� </td>
		</tr>
	</table>
	<input type="submit" name="submit" value="�α���">
	<input type="reset" name="reset" value="���">
</form>



</body>
</html>