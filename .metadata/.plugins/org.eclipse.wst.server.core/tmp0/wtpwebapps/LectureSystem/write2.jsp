<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�Խ���</title>

<SCRIPT language="JavaScript">
function Check() {
	if(Write.name.value.length < 1) {
		alert("�ۼ��ڸ� �Է��ϼ���");
		Write.name.focus();
			return false;
	}
	if(Write.pass.value.length < 1) {
		alert("��й�ȣ�� �Է��ϼ���");
		Write.name.focus();
			return false;
	}
	
	if(Write.title.value.length < 1) {
		alert("������ �Է��ϼ���.");
		Write.write_title.focus();
			return false;
	}
	if(Write.contents.value.length < 1) {
		alert("�� ������ �Է��ϼ���.");
		Write.content.focus();
			return false;
	}

Write.submit();
}
</SCRIPT>
</head>

<body>

<table border='0' width='600' cellpadding='0' cellspacing='0'>
	<tr>
		<td>
			<center> <font size='3'> <b> ���� </b></font></center>
		</td>
	</tr>
	<tr>
		<td><hr size='1' noshade></td>
	</tr>
</table>

<form Name='write1' action="write_input2.jsp" Method="get" enctype="multipart/form-data" onsubmit="return Check()">
	<table border='0' width='600' cellpadding='2' cellspacing='2'>

		<tr>
			<td width='100' bgcolor='cccccc'>
				<font size='2'><center><b>�ۼ���</b></center></font>
			</td>
			<td>
				<input type='text' size='12' name='name'> * �ʼ�
			</td>
		</tr>
		
		<tr>
			<td width='100' bgcolor='cccccc'>
				<font size='2'><center><b>��й�ȣ</b></center></font>
			</td>
			<td>
				<input type='text' size='12' name='pass'> * �ʼ� (�Խù� ���� ������ �ʿ�)
			</td>
		</tr>
		
		<tr>
			<td colspan='2'>
				<hr size='1' noshade>
			</td>
		</tr>
		
		<tr>
			<td width='100' bgcolor='cccccc'>
				<font size='2'><center><b>�� ����</b></center></font>
			</td>
			<td>
				<font size='2'><input type='text' size='70' maxlength='50' name='title'></font>
			</td>
		</tr>
		
		<tr>
			<td bgcolor='cccccc'>
				<font size='2'><center><b>�� ����</b></center></font>
			</td>
			<td>
				<font size='2'>
				<textarea cols='70' rows='15' rows='virtual' name='contents'></textarea></font>
			</td>
		</tr>
		
		<tr>
			<td width='100' bgcolor='cccccc'>
				<font size='2'><center><b>÷������</b></center></font>
			</td>
			<td>
				<input type="file" name="s_file"/><br/>

			</td>
		</tr>
		
		<tr>
			<td colspan='2'>
				<hr size='1' noshade>
			</td>
		</tr>
			
		<tr>
			<td align='center' colspan='2' width='100%'>
			<table>
				<tr>
					<td width='100' align='center'>
						<input type='Reset' value='�ٽ� �ۼ�'>
					</td>
					<td width='100' align='center'>
						<input type='submit' value='���'>
					</td>
				</tr>
			</table>
			</td>
		</tr>
	</table>
		
</form>

</body>
</html>