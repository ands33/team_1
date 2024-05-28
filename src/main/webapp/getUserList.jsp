<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원 리스트</title>
<link rel="stylesheet" href="resources/user_style.css">
</head>
<body>
	<center>
		<h1>회원 리스트</h1>
		<hr>
		<table border="1" width="800">
			<tr>
				<th width="50">번호</th>
				<th width="100">이름</th>
				<th width="100">아이디</th>
				<th width="50">성별</th>
				<th width="100">전화번호</th>
				<th width="150">이메일</th>
				<th width="250">주소</th>
				<th width="250">자기소개</th>
			</tr>
			<c:forEach items="${userList}" var="user">
				<tr>
					<td align="center">${user.u_seq}</td>
					<td align="center"><a href="modifyUser.do?u_id=${user.u_id}">${user.u_name}</a></td>
					<td align="center">${user.u_id}</td>
					<td align="center">${user.u_gender}</td>
					<td>${user.u_phone}</td>
					<td>${user.u_email}</td>
					<td>${user.u_addr}</td>
					<td>${user.u_introduce}</td>
				</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>