<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/fortune.jsp</title>
</head>
<body>
<%
	
	//오늘의 운세 5가지를 미리 준비 해둔다.
	String[] fortunes= {"차에 치여 사망", "맨홀 밟고 전치12주", "로또 1등", "집에만 계세요"};

	Random random = new Random();
	//0~4 사이의 랜덤한 정수 얻어내기
	int ranNum=random.nextInt(4);
	
%>
	<p>오늘의 운세: <%=fortunes[ranNum] %></p>
	<p>오늘의 운세: <%out.print(fortunes[ranNum]); %></p>
</body>
</html>