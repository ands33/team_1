<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>글 목록</title>
<link rel="stylesheet" href="resources/board_styles.css">
</head>
<body>
	<center>
		<h1>글 목록</h1>
		<h3>
			${userName}님 환영합니다...<a href="logout.do">Log-out</a>
		</h3>
		<!-- 검색 시작 -->
		<form action="getBoardList.do${user.u_id }" method="post">
			<table border="1" cellpadding="0" cellspacing="0" width="700">
				<tr>
					<td align="right"><select name="searchCondition">
					<c:forEach items="${conditionMap}" var="option">
						<option value="${option.value}">${option.key}
					</c:forEach>
							<!-- 
							<option value="TITLE">제목
							<option value="CONTENT">내용 
							-->
					</select> 
					<input name="searchKeyword" type="text" /> 
					<input type="submit"
						value="검색" /></td>
				</tr>
			</table>
		</form>
		<!-- 검색 종료 -->
		<table border="1" cellpadding="0" cellspacing="0" width="700">
			<tr>
				<th bgcolor="orange" width="70">번호</th>
				<th bgcolor="orange" width="360">제목</th>
				<th bgcolor="orange" width="100">작성자</th>
				<th bgcolor="orange" width="100">등록일</th>
				<th bgcolor="orange" width="70">조회수</th>
			</tr>
			<c:forEach items="${boardList}" var="board">			
			<tr>
				<td>${board.seq}</td>
				<td style="text-align: left;">
				  <a href="getBoard.do?seq=${board.seq}">${board.title}</a></td>
				<td>${board.writer}</td>
				<td>${board.regDate}</td>
				<td>${board.cnt}</td>
			</tr>
			</c:forEach>
		</table>
		<br> <a href="insertBoard.jsp">새글 등록</a> <a href="getBoardList.do">목록으로</a>
	</center>
</body>
</html>


