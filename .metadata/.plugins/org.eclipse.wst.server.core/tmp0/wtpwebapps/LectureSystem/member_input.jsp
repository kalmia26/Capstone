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
	if(Member_input.id.value.length < 1) {
		alert("아이디를 입력하세요.");
		Member_input.id.foucs();
		return false;
	}
	if(Member_input.pass.value.length < 1) {
		alert("비밀번호를 입력하세요.");
		Member_input.pass.focus();
		return false;
	}
	if(Member_input.name.value.length < 1) {
		alert("이름을 입력하세요.");
		Member_input.name.focus();
		return false;
	}
	if(Member_input.juminnum1.value.length < 1) {
		alert("주민등록번호를 입력하세요.");
		Member_input.juminnum1.focus();
		return false;
	}
	if(Member_input.juminnum1.value.length != 6) {
		alert("주민등록번호 앞자리는 6자리 입니다.");
		Member_input.juminnum1.focus();
		return false;
	}
	for (var i=0; i<member_input.juminnum1.value.lenght; i++) {
		if(member_input.juminnum1.value.charAt(i) < "0" || member_input.juminnum1.value.charAt(i) > "9") {
			alert("주민등록번호는 숫자만 가능합니다.");
			member_input.juminnum1.focus();
			return false;
		}
	}
	if(Member_input.juminnum2.value.length < 1) {
		alert("주민등록번호를 입력하세요.");
		Member_input.juminnum2.focus();
		return false;
	}
	if(Member_input.juminnum2.value.length != 7) {
		alert("주민등록번호 뒷자리는 7자리 입니다.");
		Member_input.juminnum2.focus();
		return false;
	}
	for (var i=0; i<member_input.juminnum2.value.lenght; i++) {
		if(member_input.juminnum2.value.charAt(i) < "0" || member_input.juminnum2.value.charAt(i) > "9") {
			alert("주민등록번호는 숫자만 가능합니다.");
			member_input.juminnum2.focus();
			return false;
		}
	}
	var sum,a,b,c,d,e,f,g,h,i,j,k,l,m;
	
	a = praseInt(member_input.juminnum1.value.charAt(0));
	b = praseInt(member_input.juminnum1.value.charAt(1));
	c = praseInt(member_input.juminnum1.value.charAt(2));
	d = praseInt(member_input.juminnum1.value.charAt(3));
	e = praseInt(member_input.juminnum1.value.charAt(4));
	f = praseInt(member_input.juminnum1.value.charAt(5));
	g = praseInt(member_input.juminnum2.value.charAt(0));
	h = praseInt(member_input.juminnum2.value.charAt(1));
	i = praseInt(member_input.juminnum2.value.charAt(2));
	j = praseInt(member_input.juminnum2.value.charAt(3));
	k = praseInt(member_input.juminnum2.value.charAt(4));
	l = praseInt(member_input.juminnum2.value.charAt(5));
	m = praseInt(member_input.juminnum2.value.charAt(6));
	
	sum = a*2 + b*3 + c*4 + d*5 + e*6 + f*7 + g*8 + h*9 + i*2 + j*3 + k*4 + l*5;
	
	var namuji = sum % 11;
	var humsa = 11 - namuji;
	var check_no = gumsa % 10;
	
	if(check_no != m) {
		alert("올바른 주민등록번호가 아닙니다.");
		member_input.juminnum2.focus();
		return false;
	}
	Member.submit();
}

function Check_focus() {
	var strfocus1 = member_input.juminnum1.value.length;
	if(strfocus1 == 6)
		member_input.juminnum2.focus();
}
function check_id() {
	browsing_window = window.open("checkid.jsp?id="+member_input.id.value,
			"_idcheck","height=200, wight=300, menubar=no, directories=no, resizable=no, status=no, scrollbars=yes");
	browsing_window.focus();
}
</script>

</head>
<body>
<center><font size='3'><b>회원 가입</b></font>
	<table border='0' width='600' cellpadding='0' cellspacing='0'>
		<tr>
			<td><hr size='1' noshade>
			</td>
		</tr>
	</table>
	
	<form name="member_input" method="post" action="member_output.jsp">
		<table border='2' cellspacing='0' cellpadding='5' align=center>
		<tr>
			<td bgcolor='cccccc' align='center'>
				<font size='2'>아 이 디</font>
			</td>
			<td bgcolor='cccccc'>
				<input type="text" maxlength="10" size="10" name="id">
				<input type="button" onclick="Check_id()" value="ID 중복검사">
			</td>
		</tr>
		<tr>
			<td bgcolor='cccccc' align='center'>
				<font size='2'>비 밀 번 호</font>
			</td>
			<td bgcolor='cccccc'>
				<input type="password" maxlength="10" size="10" name="pass">
			</td>
		</tr>
		<tr>
			<td bgcolor='cccccc' align='center'>
				<font size='2'>이 름</font>
			</td>
			<td bgcolor='cccccc'>
				<input type="text" maxlength="10" size="10" name="name">
			</td>
		</tr>
		<tr>
			<td bgcolor='cccccc' align='center'>
				<font size='2'>주민등록번호</font>
			</td>
			<td bgcolor='cccccc'>
				<input type="text" size="6" maxlength="6" name="juminnum1" onkeypress="check_focus();" >-
				<input type="text" size="7" maxlength="7" name="juminnum2"> 
			</td>
		</tr>
		<tr>
			<td bgcolor='cccccc' align='center'>
				<font size='2'>주 소</font>
			</td>
			<td bgcolor='cccccc'>
				<input type="text" maxlength="50" size="50" name="address">
			</td>
		</tr>
		<tr>
			<td bgcolor='cccccc' align='center'>
				<font size='2'>연 락 처</font>
			</td>
			<td bgcolor='cccccc'>
				<input type="text" maxlength="20" size="20" name="phone">
			</td>
		</tr>
		<tr>
			<td bgcolor='cccccc' align='center'>
				<font size='2'>이 메 일</font>
			</td>
			<td bgcolor='cccccc'>
				<input type="text" maxlength="50" size="50" name="email">
			</td>
		</tr>
		</table>
		
		<table border="0" width="600" cellpadding="0" cellspacing="0">
			<tr>
				<td><hr size='1' noshade>
				</td>
			</tr>
		</table>
		
		<table>
			<tr>
				<td colspan='2' align="center">
					<input type="button" onclick="check()" value="회원가입">
				</td>
			</tr>
		</table>
	</form>
</center>


</body>
</html>