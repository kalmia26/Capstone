<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table width="100%" cellpadding="0" cellspacing="0" border="0">
	<tr height="5"><td width="5"></td></tr>
	
	<tr>
		<td width="200">����</td>
		<td width="100">�ۼ���</td>
	</tr>
	
		<tr height="1" bgcolor="#000000">
		<td colspan="6"></td></tr>
</table>

<% // �Խ��� ����Ʈ�ۼ� %>


 <div style="position:absolute; right:0px; bottom:0px;">
<table>
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
    	  <option value="1">�����Խ���</option>
          <option value="2">�ڷ�����Խ���</option>
          <option value="3">�����Խ���</option>
          <option value="4">����</option>
		</select>
		
		<input type="submit" value="�̵�">
		
		</form>
	</td>

  </tr>
	</table>
 </div>
</body>
</html>