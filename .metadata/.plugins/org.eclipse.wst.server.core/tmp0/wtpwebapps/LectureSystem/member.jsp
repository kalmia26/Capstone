<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
<!--
	a:link	{font-family:""; color:black; text-decoration:none;}
	a:visited	{font-family:""; color:black; text-decoration:none;}
	a:hover	{font-family:""; color:black; text-decoration:underline;}
-->
</style>

<script language="JavaScript">
function Check() {
	if(Member.id.value.length < 1) {
		alert("���̵� �Է��ϼ���.");
		Member.id.foucs();
		return false;
	}
	
	if(Member.pass.value.length < 1) {
		alert("��й�ȣ�� �Է��ϼ���.");
		Member.pass.focus();
		return false;
	}
	Member.submit();
}
</script>

</head>
<body>

<center><font size='3'><b>�α��� ȭ��</b></font></center>

<table border='0' width='600' cellpadding='0' cellspacing='0'>
	<tr>
		<td><hr size='1' noshade>
		</td>
	</tr>
</table>

<form name="Member" Method="post" Action="member_ok.jsp">
	<table align=center width='300' border='0' cellpadding='10' cellspacing='0'>
		<tr>
			<td bgcolor='cccccc' align='right'>
				<font size='2'>ID : </font>
			</td>
			<td bgcolor='cccccc' align='center'>
				<input type=text maxlength=10 size=10 name=UserId>
			</td>
		</tr>
		<tr>
			<td bgcolor='cccccc' align='right'>
				<font size='2'>��й�ȣ : </font>
			</td>
			<td bgcolor='cccccc' align='center'>
				<input type='password' maxlength=10 size =10 name=pass>
			</td>
		</tr>
		<tr>
			<td bgcolor='cccccc' align='right'>
				<font size='2'>
				<a href="member_input.jsp">[ȸ������]</a></font>
			</td>
			<td bgcolor='cccccc' align='center'>
				<input onclick='Check()' type='button' value='�α���'>
			</td>
		</tr>
	</table>
	
</form>

</body>
</html>