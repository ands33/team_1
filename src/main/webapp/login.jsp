<%@page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>게시판 로그인</title>
 <link rel="stylesheet" href="resources/board_styles.css">
<!--  <style>
    table {border-collapse: collapse;}
    h1    {color:#336699;}
 </style> -->
</head>
<body>
	<center>
		<h1>로그인</h1>
		<hr>
		<form action="login.do" method="post">
			<table border="1" cellpadding="2" cellspacing="3">
				<tr>
					<td bgcolor="orange">아이디</td>
					<td><input type="text" name="u_id" size="20" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">비밀번호</td>
					<td><input type="password" name="u_pw"  size="20" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="로그인" /></td>
				</tr>
			</table>
		</form>
		<hr>
	</center>
</body>
</html>